package pl.kozlowski.reservation.demo.service;

import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;


import java.util.Date;
import java.util.List;

public interface BookingService {


    Booking addReservation(String First_Name, String Surname, Long Phone, Date start_date, Date end_date, Room room) throws Exception;
    void deleteReservation(Long id);
    List<Booking> getAllBookings();



}
