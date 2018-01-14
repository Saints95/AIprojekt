package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;

import java.util.Date;
import java.util.List;

public interface HotelRoomService {
    Room getHotelRoomById(Long id);
    List<Room> findAllRooms();
    String ifRoomIsFree(Room room, Date start_date, Date end_date);
    List<Booking> allRoomBookings();
    void deleteRoomById(Long id);
}
