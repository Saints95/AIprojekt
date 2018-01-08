package pl.kozlowski.reservation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kozlowski.reservation.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
