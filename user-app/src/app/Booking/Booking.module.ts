import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BookingRoutingModule } from './Booking-routing.module';
import { BookingRoomComponent } from './Booking-Room/Booking-Room.component';

import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { deleteBookingComponent } from './delete-Booking/delete-Booking.component';
@NgModule({
  imports: [
    CommonModule,
    BookingRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  declarations: [BookingRoomComponent, deleteBookingComponent]
})
export class BookingModule { }