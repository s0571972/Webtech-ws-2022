package htw.berlin.webtech.demo.repos;

import htw.berlin.webtech.demo.entity.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository <Service, Long> {
}
