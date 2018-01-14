import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {BookingService} from "../Booking.service";
import {Room} from "../Room";
import {Booking} from "../Booking";

@Component({
  selector: 'app-booking-room',
  templateUrl: './Booking-Room.component.html',
  styleUrls: ['./Booking-Room.component.css'],
  providers: [BookingService]
})
export class BookingRoomComponent implements OnInit {

  bookingForm: FormGroup;
  booking : Booking;
  constructor(private bookingService: BookingService, private router: Router) { }

ngOnInit() {
    this.bookingForm = new FormGroup({
      roomid: new FormControl('', Validators.required),
      startDate: new FormControl('', Validators.required),
      endDate: new FormControl('', Validators.required),
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      phone: new FormControl('', Validators.required)
    });
  }

  onSubmit(){
    if (this.bookingForm.valid) {
      let startDate = this.bookingForm.controls['startDate'].value;
      let endDate = this.bookingForm.controls['endDate'].value;
      let firstName = this.bookingForm.controls['firstName'].value;
      let lastName = this.bookingForm.controls['lastName'].value;
      let phone = this.bookingForm.controls['phone'].value;
      let roomid = this.bookingForm.controls['roomId'].value;


      this.booking.FirstName = firstName;
      this.booking.LastName = lastName;
      this.booking.Phone = phone;
      this.booking.StartDate = startDate;
      this.booking.EndDate = endDate;
      this.booking.Room.id = roomid;
      this.bookingService.bookRoom(this.booking).subscribe();
      this.bookingForm.reset();
      this.router.navigate(['/']);
    }
  }

}