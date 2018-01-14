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
    public Booking addReservation(Booking book) throws Exception {
        Booking booking = new Booking();
        HotelRoomServiceImpl check = new HotelRoomServiceImpl();
        String r;
        r = check.ifRoomIsFree(book.getRoomId(),book.getStartDate(),book.getEndDate());
        booking.setFirstName(book.getFirstName());
        booking.setLastName(book.getLastName());
        booking.setPhone(book.getPhone());
        booking.setStart_date(book.getStartDate());
        booking.setEnd_date(book.getEndDate());
        if(r == "Error") {
            throw new Exception();
        }
        booking.setRoom(book.getRoomId());
        return bookingRepository.save(booking);
        }

    @Override
    public void deleteReservation(Long id) {
        bookingRepository.delete(id);

    }

}
