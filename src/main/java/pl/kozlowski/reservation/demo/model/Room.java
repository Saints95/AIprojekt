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

    public Long getId() {
        return id;
    }
}
