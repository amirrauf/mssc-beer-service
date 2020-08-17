package guru.framework.msscbeerservice.events;

import guru.framework.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {

	public BrewBeerEvent(BeerDto beerDto) {
		super(beerDto);
	}


}
