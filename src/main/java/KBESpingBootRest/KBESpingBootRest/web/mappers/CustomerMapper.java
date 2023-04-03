package KBESpingBootRest.KBESpingBootRest.web.mappers;

import KBESpingBootRest.KBESpingBootRest.domain.Customer;
import KBESpingBootRest.KBESpingBootRest.web.model.CustomerDTO;

import org.mapstruct.Mapper;

/**
 * @Created 03 04 2023 - 9:49 AM
 * @Author Hazeem Hassan
 */
@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
