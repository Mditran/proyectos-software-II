package co.unicauca.travelagency.presentation.rest;


import co.unicauca.travelagency.domain.entity.Customer;
import co.unicauca.travelagency.domain.services.CustomerService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Stateless
@Path("customers")
public class CustomerController {
    
    @Inject
    private CustomerService service;

    public CustomerController() {
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Customer> findAll() {
        return service.findAllCustomers();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Customer findCustomerById(@PathParam("id") String id) {
        return service.findCustomerById(id);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String createCustomer(Customer cust) {
        if (service.createCustomer(cust)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Cliente creado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el Cliente\",\"errores\":\"Id ya existe\"}";
        }
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String updateCustomer(Customer cust) {
        if (service.updateCustomer(cust)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Cliente modificado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo modificar el Cliente\",\"errores\":\"Id no existe\"}";
        }
    }
    
    @DELETE
    @Path("{id}")
    public String remove(@PathParam("id") String id) {
        if (service.deleteCustomer(id)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Cliente borrado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo borrar el Cliente\",\"errores\":\"Id no existe\"}";
        }
    }
}
