package guru.framework.msscbeerservice.events;

import guru.framework.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {

	public NewInventoryEvent(BeerDto beerDto) {
		super(beerDto);
	}

}
