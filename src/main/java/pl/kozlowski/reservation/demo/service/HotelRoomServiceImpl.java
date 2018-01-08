package pl.kozlowski.reservation.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kozlowski.reservation.demo.model.Room;

import java.util.List;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {
    @Autowired
    private pl.kozlowski.reservation.demo.repository.HotelRepository hotelRepository;

    @Override
    public List<Room> getHotelRoomBySize(String size) {
       return hotelRepository.findBySize(size);
    }

    @Override
    public List<Room> findAllRooms() {
        return null;
    }

    @Override
    public List<Room> finaFreeRooms() {
        return null;
    }
}
