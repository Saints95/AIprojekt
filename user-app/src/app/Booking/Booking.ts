import {Room} from "./Room";

export class Booking{

  first_name: string;
  last_name: string;
  phone: number;
  start_date: Date;
  end_date: Date;
  room: Room;
  constructor(room: Room, fName: string, lName: string, startDate: Date, endDate: Date, phone: number){
    this.room = room;
    this.first_name = fName;
    this.last_name = lName;
    this.start_date = startDate;
    this.end_date = endDate;
    this.phone = phone;
  }
}