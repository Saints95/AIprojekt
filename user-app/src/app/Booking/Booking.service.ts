import { Injectable } from '@angular/core';
import {Observable} from "rxjs/Observable";
import {Http, Response, RequestOptions, URLSearchParams} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Room} from "./Room";
import {Booking} from "./Booking";

@Injectable()
export class BookingService {

	private urlBookingRooms = 'http://localhost:8080/Booking';
	private urlDeleteBooking = 'http://localhost:8080/deleteBooking';
 	constructor(private http: Http) { }

  bookRoom(booking : Booking): Observable<Booking[]>{
    return this.http.post(this.urlBookingRooms,booking)
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

    deleteBooking(BookingId: number): Observable<boolean>{
    return this.http.delete(this.urlDeleteBooking + '/' + BookingId)
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }


}