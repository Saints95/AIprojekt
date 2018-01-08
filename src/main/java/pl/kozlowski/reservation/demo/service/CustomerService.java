package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findByName(Customer client);
    List<Customer> addCustomer(Customer client);

}
