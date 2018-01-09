package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Customer;


import java.util.List;

public interface BookingService {

    Booking findReservationByRoomId(Integer id);
    Booking addReservation(Booking reservation, Customer customer);
    void deleteReservation(Booking reservation);



}
