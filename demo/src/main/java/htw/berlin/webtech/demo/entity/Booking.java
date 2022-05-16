package htw.berlin.webtech.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;
    private  int customer_id;
    private int service_id;
    private Date date_service;
    private Date time_service;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public Date getDate_service() {
        return date_service;
    }

    public void setDate_service(Date date_service) {
        this.date_service = date_service;
    }

    public Date getTime_service() {
        return time_service;
    }

    public void setTime_service(Date time_service) {
        this.time_service = time_service;
    }
}
