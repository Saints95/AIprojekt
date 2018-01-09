package pl.kozlowski.reservation.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name="LAST_NAME")
    private String last_name;

    @Column(name="PHONE")
    private Long phone;

    @Column(name = "START_DATE")
    private Date start_date;

    @Column(name = "END_DATE")
    private Date end_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "ROOM_ID")
    private Room room;

        public Date getStartDate(){return start_date;}
        public Date getEndDate(){return end_date;}
        public Room getRoomId(){return room;}

        public void setFirstName(String name){
            first_name = name;
        }

        public void setLastName(String name){
            last_name = name;
        }
        public void setPhone(Long p) {
            phone = p;
        }
         public void setStart_date(Date d){
            start_date = d;
        }
        public void setEnd_date(Date d) {
            end_date = d;
        }

        public void setRoom(Room r){
            room = r;
        }
}
