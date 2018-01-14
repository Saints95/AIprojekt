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
  constructor(private bookingService: BookingService, private router: Router) { }
  roomz: Room

ngOnInit() {
    this.bookingForm = new FormGroup({
      roomid: new FormControl('', Validators.required),
      startDate: new FormControl('startDate', Validators.required),
      endDate: new FormControl('endDate', Validators.required),
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      phone: new FormControl('', Validators.required)
    });
  }

  onSubmit(){
      let roomid = this.bookingForm.controls['roomid'].value;

      this.bookingService.getHotelRoomById(roomid).subscribe(
        Room => {
          this.roomz = Room;
        },
        err=>{
          console.log(err);
        }
      );
    

      let startDate = this.bookingForm.controls['startDate'].value;
      let endDate = this.bookingForm.controls['endDate'].value;
      let firstName = this.bookingForm.controls['firstName'].value;
      let lastName = this.bookingForm.controls['lastName'].value;
      let phone = this.bookingForm.controls['phone'].value;

    let booking : Booking = new Booking( 
      this.bookingForm.controls['firstName'].value,
      this.bookingForm.controls['lastName'].value,
      this.bookingForm.controls['phone'].value,
      this.bookingForm.controls['startDate'].value,
      this.bookingForm.controls['endDate'].value,
      this.bookingForm.controls['roomz'].value,
      );
      this.bookingService.bookRoom(booking).subscribe();
      this.bookingForm.reset();
      this.router.navigate(['/']);
    }
  }
