package guru.framework.msscbeerservice.events;

import java.io.Serializable;

import guru.framework.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

	private static final long serialVersionUID = -3330802013382274982L;
	
	private final BeerDto beerDto;

}
