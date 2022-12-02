package co.unicauca.travelagency.domain.services;


import co.unicauca.travelagency.access.ICustomerRepository;
import co.unicauca.travelagency.domain.entity.Customer;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@RequestScoped
public class CustomerService {
    
    @Inject
    @Default
    ICustomerRepository repo;
    
    public CustomerService() {
    }

    public List<Customer> findAllCustomers() {
        return repo.findAllCustomers();
    }
    
    public Customer findCustomerById(String id) {
        return repo.findCustomerById(id);
    }
    
    public boolean createCustomer(Customer customer) {
        return repo.createCustomer(customer);
    }
     public boolean updateCustomer(Customer customer) {
        return repo.updateCustomer(customer);
    }

    public boolean deleteCustomer(String id) {
        return repo.deleteCustomer(id);
    }
}
