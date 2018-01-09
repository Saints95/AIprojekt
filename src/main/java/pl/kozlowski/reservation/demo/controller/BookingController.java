package pl.kozlowski.reservation.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.kozlowski.reservation.demo.model.Room;
import pl.kozlowski.reservation.demo.service.BookingService;
import pl.kozlowski.reservation.demo.service.HotelRoomService;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private HotelRoomService hotelRoomServ;

    @Autowired
    private CustomerService customerServ;

    @Autowired
    private BookingService bookingServ;


    @GetMapping("/GetBySize/{size}")
    public List<Room> Controller(@PathVariable(value = "size") String size) {

        return hotelRoomServ.getHotelRoomBySize(size);
    }
}