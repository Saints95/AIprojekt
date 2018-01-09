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

    @Column(name = "START_DATE")
    private Date start_date;

    @Column(name = "END_DATE")
    private Date end_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "ROOM_ID")
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "KLIENT_ID")
    private Customer customer;

        public Date  getStartDate(){return start_date;}
        public Date getEndDate(){return end_date;}
        public Room getRoomId(){return room;}


}
