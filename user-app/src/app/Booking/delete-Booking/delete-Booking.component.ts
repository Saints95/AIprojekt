import { Component, OnInit } from '@angular/core';
import {BookingService} from "../Booking.service";
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-delete-booking',
  templateUrl: './delete-booking.component.html',
  styleUrls: ['./delete-booking.component.css'],
  providers: [BookingService]
})
export class deleteBookingComponent implements OnInit {
  deleteBookingForm: FormGroup;

  constructor(private bookingService: BookingService,
              private router: Router) { }

  ngOnInit() {
      this.deleteBookingForm = new FormGroup({
      bookingId: new FormControl('', Validators.required)
    });
  }

   onSubmit(){
    if (this.deleteBookingForm.valid) {
      this.bookingService.deleteBooking(this.deleteBookingForm.controls['bookingId'].value).subscribe();
      this.router.navigate(['/']);
    }
  }


}