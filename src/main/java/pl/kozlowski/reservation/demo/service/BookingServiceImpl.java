package pl.kozlowski.reservation.demo.service;

import org.springframework.stereotype.Service;
import pl.kozlowski.reservation.demo.model.Booking;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public List<Booking> findReservationByRoomId(Integer id) {
        return null;
    }

    @Override
    public List<Booking> addReservation(Booking reservation) {
        return null;
    }

    @Override
    public void deleteReservation(Booking reservation) {

    }
}
