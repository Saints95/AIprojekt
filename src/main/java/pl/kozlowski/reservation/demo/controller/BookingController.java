package pl.kozlowski.reservation.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kozlowski.reservation.demo.model.Booking;
import pl.kozlowski.reservation.demo.model.Room;
import pl.kozlowski.reservation.demo.service.BookingService;
import pl.kozlowski.reservation.demo.service.HotelRoomService;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

    @Autowired
    private HotelRoomService hotelRoomServ;


    @Autowired
    private BookingService bookingServ;


    @GetMapping("/GetBySize/{size}")
    public List<Room> Controller(@PathVariable(value = "size") String size) {

        return hotelRoomServ.getHotelRoomBySize(size);
    }

    @GetMapping("/isRoomFree")
    public List<Room> checkRoom(Room pokoj, Date start_date, Date end_date){
        List<Room> room = hotelRoomServ.ifRoomIsFree(pokoj,start_date,end_date);
        return room;
    }

    @PostMapping("/Booking")
    public Booking addReservation(String First_Name, String Surname, Long Phone, Date start_date, Date end_date, Room room) throws Exception{
        Booking booking;
        booking = bookingServ.addReservation(First_Name,Surname,Phone,start_date,end_date,room);
        return booking;
    }

    @DeleteMapping("/deleteBooking/{id}")
        public void deleteBooking(@PathVariable(value ="id")Long id){
        bookingServ.deleteReservation(id);
    }
}