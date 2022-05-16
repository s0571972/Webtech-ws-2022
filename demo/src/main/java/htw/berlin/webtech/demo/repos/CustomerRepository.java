package htw.berlin.webtech.demo.repos;

import htw.berlin.webtech.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends CrudRepository <Customer, Long> {
}
