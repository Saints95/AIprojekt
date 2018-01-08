package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Room;

import java.util.List;

public interface HotelRoomService {
    List<Room> getHotelRoomBySize(String size);
    List<Room> findAllRooms();
    List<Room> finaFreeRooms();
}
