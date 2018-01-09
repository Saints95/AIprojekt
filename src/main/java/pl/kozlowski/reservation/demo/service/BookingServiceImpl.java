package pl.kozlowski.reservation.demo.service;

import org.springframework.stereotype.Service;
import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Customer;
import pl.kozlowski.reservation.demo.model.Room;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public Booking findReservationByRoomId(Integer id) {
        return null;
    }

    @Override
    public Booking addReservation(Booking reservation, Customer customer) {
        return null;
        }

    @Override
    public void deleteReservation(Booking reservation) {

    }

}
