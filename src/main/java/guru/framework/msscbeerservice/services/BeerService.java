package guru.framework.msscbeerservice.services;

import java.util.UUID;

import org.springframework.data.domain.PageRequest;

import guru.framework.msscbeerservice.web.model.BeerDto;
import guru.framework.msscbeerservice.web.model.BeerPagedList;
import guru.framework.msscbeerservice.web.model.BeerStyleEnum;

public interface BeerService {
	
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);
    
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
