package guru.framework.msscbeerservice.web.mappers;

import guru.framework.msscbeerservice.domain.Beer;
import guru.framework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
