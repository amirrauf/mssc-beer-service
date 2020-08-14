package guru.framework.msscbeerservice.web.mappers;

import guru.framework.msscbeerservice.domain.Beer;
import guru.framework.msscbeerservice.web.model.BeerDto;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
