package htw.berlin.webtech.demo.service;

import htw.berlin.webtech.demo.repos.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

}
