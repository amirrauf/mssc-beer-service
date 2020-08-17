package guru.framework.msscbeerservice.services.brewing;

import java.util.List;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import guru.framework.msscbeerservice.config.JmsConfig;
import guru.framework.msscbeerservice.domain.Beer;
import guru.framework.msscbeerservice.repositories.BeerRepository;
import guru.framework.msscbeerservice.services.inventory.BeerInventoryService;
import guru.framework.msscbeerservice.web.mappers.BeerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class BrewingService {
    private final BeerRepository beerRepository;
    private final BeerInventoryService beerInventoryService;
    private final JmsTemplate jmsTemplate;
    private final BeerMapper beerMapper;
    
    @Scheduled(fixedRate = 4000)
    public void checkForLowInventory() {
    	List<Beer> beers = beerRepository.findAll();
    	
    	beers.forEach(beer -> {
    		Integer invQOH = beerInventoryService.getOnhandInventory(beer.getId());
    		
            log.debug("Min Onhand is: " + beer.getMinOnHand());
            log.debug("Inventory is: "  + invQOH);
            
            if (beer.getMinOnHand() >= invQOH) {
            	jmsTemplate.convertAndSend(JmsConfig.BREWING_REQUEST_QUEUE, beerMapper.beerToBeerDto(beer));
            }
    		
    	});
    	
    	
    }

}
