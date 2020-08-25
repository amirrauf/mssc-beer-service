package guru.framework.msscbeerservice.services.inventory;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import guru.framework.msscbeerservice.services.inventory.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class InventoryServiceFeignClientFailover implements InventoryServiceFeignClient {
	
    private final InventoryFailoverFeignClient failoverFeignClient;

    @Override
    public ResponseEntity<List<BeerInventoryDto>> getOnhandInventory(UUID beerId) {
        return failoverFeignClient.getOnhandInventory();
	}

}
