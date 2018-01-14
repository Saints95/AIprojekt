export class Room {
  id: number;
  size: string;
  room_number: number;
  constructor(id: number, size: string, roomn: number){
    this.id = id;
    this.room_number = roomn;
    this.size = size;
  }
}