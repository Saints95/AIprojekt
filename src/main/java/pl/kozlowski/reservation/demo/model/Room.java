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
@Table(name = "ROOM")
public class Room {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SIZE", nullable = false)
    private String size;

    @Column(name = "ROOM_NUMBER")
    private long room_number;

    @Column(name = "START_DATE")
    private Date start_date;

    @Column(name = "END_DATE")
    private Date end_date;

    public Date getStart_date() {
        return start_date;
    }
    public Date getEnd_date(){
        return end_date;
    }

    public Long getId() {
        return id;
    }
}
