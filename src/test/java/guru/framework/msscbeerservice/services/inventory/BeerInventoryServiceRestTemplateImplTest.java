package guru.framework.msscbeerservice.services.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.framework.msscbeerservice.bootstrap.BeerLoader;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

	@Autowired
	BeerInventoryService beerInventoryService;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetOnhandInventory() {
		Integer qoh = beerInventoryService.getOnhandInventory(BeerLoader.BEER_1_UUID);

		System.out.println(qoh);
	}

}
