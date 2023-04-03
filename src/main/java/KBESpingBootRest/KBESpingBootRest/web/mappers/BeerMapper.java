package KBESpingBootRest.KBESpingBootRest.web.mappers;


import KBESpingBootRest.KBESpingBootRest.domain.Beer;
import KBESpingBootRest.KBESpingBootRest.web.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * @Created 03 04 2023 - 9:49 AM
 * @Author Hazeem Hassan
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDTO beerToBeerDto(Beer beer);

    BeerDTO beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDTO dto);
}
