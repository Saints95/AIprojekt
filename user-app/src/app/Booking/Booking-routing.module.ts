import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BookingRoomComponent} from "./Booking-Room/Booking-Room.component";
import {deleteBookingComponent} from "./delete-Booking/delete-Booking.component";

const routes: Routes = [
  {path: 'Booking', component: BookingRoomComponent},
  {path: 'deleteBooking', component: deleteBookingComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BookingRoutingModule { }