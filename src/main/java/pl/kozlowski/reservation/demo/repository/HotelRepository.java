package pl.kozlowski.reservation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kozlowski.reservation.demo.model.Room;

import java.util.List;

public interface HotelRepository extends JpaRepository<Room,Long>{
    List<Room> findBySize(String size);
}
