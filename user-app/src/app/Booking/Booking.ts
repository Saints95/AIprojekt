import {Room} from "./Room";

export class Booking{

  FirstName: string;
  LastName: string;
  Phone: number;
  StartDate: Date;
  EndDate: Date;
  Room: Room;
  constructor(room: Room, fName: string, lName: string, startDate: Date, endDate: Date, phone: number){
    this.Room = room;
    this.FirstName = fName;
    this.LastName = lName;
    this.StartDate = startDate;
    this.EndDate = endDate;
    this.Phone = phone;
  }
}