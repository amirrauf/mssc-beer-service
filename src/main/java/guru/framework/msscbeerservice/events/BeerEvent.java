package guru.framework.msscbeerservice.events;

import java.io.Serializable;

import guru.framework.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

	private static final long serialVersionUID = -3330802013382274982L;
	
	private BeerDto beerDto;

}
