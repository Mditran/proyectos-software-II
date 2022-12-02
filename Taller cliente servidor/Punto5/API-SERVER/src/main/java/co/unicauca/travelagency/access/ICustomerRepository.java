package co.unicauca.travelagency.access;

import co.unicauca.travelagency.domain.entity.Customer;
import java.util.List;

public interface ICustomerRepository {

    List<Customer> findAllCustomers();

    Customer findCustomerById(String id);

    boolean createCustomer(Customer newCustomer);

    boolean updateCustomer(Customer newCustomer);

    boolean deleteCustomer(String id);
}
