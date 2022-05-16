package htw.berlin.webtech.demo.service;

import htw.berlin.webtech.demo.entity.Customer;
import htw.berlin.webtech.demo.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public Customer getCustomerById (Long id){
        return  customerRepository.findById(id).orElseThrow();
    }
    public List<Customer> getCustomers (){
        return (List<Customer>) customerRepository.findAll();
    }
}
