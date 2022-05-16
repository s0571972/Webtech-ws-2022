package htw.berlin.webtech.demo.service;

import htw.berlin.webtech.demo.entity.Booking;
import htw.berlin.webtech.demo.entity.Customer;
import htw.berlin.webtech.demo.repos.BookingRepository;
import htw.berlin.webtech.demo.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }
    public Booking getBookingById (Long id){
        return  bookingRepository.findById(id).orElseThrow();
    }
    public List<Booking> getBookings (){
        return (List<Booking>) bookingRepository.findAll();
    }
}
