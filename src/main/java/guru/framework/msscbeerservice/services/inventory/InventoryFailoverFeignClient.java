package guru.framework.msscbeerservice.services.inventory;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.framework.msscbeerservice.services.inventory.model.BeerInventoryDto;

@FeignClient(name = "inventory-failover")
public interface InventoryFailoverFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "/inventory-failover")
    ResponseEntity<List<BeerInventoryDto>> getOnhandInventory();
	
}
