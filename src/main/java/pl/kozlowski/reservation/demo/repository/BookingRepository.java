package pl.kozlowski.reservation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kozlowski.reservation.demo.model.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long>{
}
