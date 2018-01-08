package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Booking;


import java.util.List;

public interface BookingService {

    List<Booking> findReservationByRoomId(Integer id);
    List<Booking> addReservation(Booking reservation);
    void deleteReservation(Booking reservation);



}
