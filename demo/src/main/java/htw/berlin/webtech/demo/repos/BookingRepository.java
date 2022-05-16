package htw.berlin.webtech.demo.repos;

import htw.berlin.webtech.demo.entity.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository <Booking, Long> {
}
