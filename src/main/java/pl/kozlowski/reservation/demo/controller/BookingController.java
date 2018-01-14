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

    @GetMapping("/GetAllRooms")
    public List<Room> ShowAllRooms() {

        return hotelRoomServ.findAllRooms();
    }

    @GetMapping("/isRoomFree")
    public String checkRoom(Room room, Date start_date, Date end_date){
        return hotelRoomServ.ifRoomIsFree(room,start_date,end_date);
    }

    @PostMapping("/Booking")
    public Booking addReservation(String First_Name, String Surname, Long Phone, Date start_date, Date end_date, Room room) throws Exception{
        Booking booking;
        booking = bookingServ.addReservation(First_Name,Surname,Phone,start_date,end_date,room);
        return booking;
    }

    @DeleteMapping("/deleteRoom/{id}")
    public void deleteRoomById(@PathVariable(value ="id") Long id){
        hotelRoomServ.deleteRoomById(id);
    }

    @GetMapping("/AllBookings")
    public List<Booking> showAllBookings(){
        return bookingServ.getAllBookings();
    }

    @DeleteMapping("/deleteBooking/{id}")
        public void deleteBooking(@PathVariable(value ="id")Long id){
        bookingServ.deleteReservation(id);
    }
}