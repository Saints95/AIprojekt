package pl.kozlowski.reservation.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;
import pl.kozlowski.reservation.demo.repository.BookingRepository;
import pl.kozlowski.reservation.demo.repository.HotelRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {

    @Autowired
    private pl.kozlowski.reservation.demo.repository.HotelRepository hotelRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Room> getHotelRoomBySize(String size) {
       return hotelRepository.findBySize(size);
    }

    @Override
    public List<Room> findAllRooms() {
        return hotelRepository.findAll();
    }
    @Override
    public List<Booking> allRoomBookings(){return bookingRepository.findAll();}

    @Override
    public List<Room> ifRoomIsFree(Room pokoj, Date start_date, Date end_date) {
        List<Booking> bookings = allRoomBookings();
        List<Room> temp = new ArrayList<>();
        for(Booking b: bookings){
        if(b.getRoomId()=pokoj.getId()){

        }
        }

    }
}
