package pl.kozlowski.reservation.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;
import pl.kozlowski.reservation.demo.repository.BookingRepository;

import java.util.Date;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings(){
      return  bookingRepository.findAll();
    }

    @Override
    public Booking addReservation(String First_Name, String Surname, Long Phone, Date start_date, Date end_date, Room room) throws Exception {
        Booking booking = new Booking();
        HotelRoomServiceImpl check = new HotelRoomServiceImpl();
        String r;
        r = check.ifRoomIsFree(room,start_date,end_date);
        booking.setFirstName(First_Name);
        booking.setLastName(Surname);
        booking.setPhone(Phone);
        booking.setStart_date(start_date);
        booking.setEnd_date(end_date);
        if(r == "Error") {
            throw new Exception();
        }
        booking.setRoom(room);
        return bookingRepository.save(booking);
        }

    @Override
    public void deleteReservation(Long id) {
        bookingRepository.delete(id);

    }

}
