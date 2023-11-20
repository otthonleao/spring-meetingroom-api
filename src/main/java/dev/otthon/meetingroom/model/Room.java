package dev.otthon.springsaladereuniao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mettingroom")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;
    @Getter @Setter
    @Column(name="name", nullable = false)
    private String name;
    @Getter @Setter
    @Column(name="date", nullable = false)
    private String date;
    @Getter @Setter
    @Column(name="startHour", nullable = false)
    private String startHour;
    @Getter @Setter
    @Column(name="endHour", nullable = false)
    private String endHour;

    public Room(){}

    public Room(long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
