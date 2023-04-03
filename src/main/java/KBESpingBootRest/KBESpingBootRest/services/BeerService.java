package KBESpingBootRest.KBESpingBootRest.services;

import KBESpingBootRest.KBESpingBootRest.web.model.BeerDTO;
import KBESpingBootRest.KBESpingBootRest.web.model.BeerPagedList;
import KBESpingBootRest.KBESpingBootRest.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

/**
 * @Created 03 04 2023 - 10:47 AM
 * @Author Hazeem Hassan
 */
public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDTO getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    BeerDTO updateBeer(UUID beerId, BeerDTO beerDto);

    BeerDTO getByUpc(String upc);

    void deleteBeerById(UUID beerId);
}
