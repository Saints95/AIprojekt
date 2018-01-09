package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;

import java.util.Date;
import java.util.List;

public interface HotelRoomService {
    List<Room> getHotelRoomBySize(String size);
    List<Room> findAllRooms();
    List<Room> ifRoomIsFree(Room pokoj, Date start_date, Date end_date);
    List<Booking> allRoomBookings();
}
