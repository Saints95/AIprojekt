package pl.kozlowski.reservation.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long>{
    List<Booking> findAllRookingsByRoom(Room room);
}
