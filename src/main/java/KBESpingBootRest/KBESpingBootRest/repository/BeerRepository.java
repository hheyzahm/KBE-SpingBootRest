package KBESpingBootRest.KBESpingBootRest.repository;

import KBESpingBootRest.KBESpingBootRest.domain.Beer;
import KBESpingBootRest.KBESpingBootRest.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
/**
 * @Created 03 04 2023 - 10:46 AM
 * @Author Hazeem Hassan
 */

public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

    Beer findByUpc(String upc);
}