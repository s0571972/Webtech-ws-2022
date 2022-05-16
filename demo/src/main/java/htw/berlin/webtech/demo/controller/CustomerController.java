package htw.berlin.webtech.demo.controller;

import htw.berlin.webtech.demo.entity.Customer;
import htw.berlin.webtech.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody  Customer customer){
        return  customerService.saveCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return  customerService.getCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return  customerService.getCustomerById(id);
    }

}
