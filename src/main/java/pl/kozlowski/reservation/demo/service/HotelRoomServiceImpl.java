package pl.kozlowski.reservation.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;
import pl.kozlowski.reservation.demo.repository.BookingRepository;
import pl.kozlowski.reservation.demo.repository.HotelRepository;

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
    public List<Booking> allRoomBookings(){
        return bookingRepository.findAll();
    }

    @Override
    public void deleteRoomById(Long id){
        hotelRepository.delete(id);
    }

    @Override
    public String ifRoomIsFree(Room room, Date start_date, Date end_date) {
        List<Booking> bookings = allRoomBookings();
        boolean temp = false;
        if(bookings.size()!=0) {
            for (Booking b : bookings) {
                if (b.getRoomId().getId() == room.getId()) {
                    for (Booking c : bookings) {
                        if ((start_date.before(c.getStartDate()) && end_date.before(c.getStartDate()))
                                || (start_date.after(c.getEndDate()) && end_date.after(c.getEndDate()))) {
                            temp = true;
                        } else temp = false;
                    }
                }
            }
            if(temp == true) {
                temp = false;
                return "OK";
            }
        }
        else{
            return "OK";
        }
        return "Error";
    }
}
