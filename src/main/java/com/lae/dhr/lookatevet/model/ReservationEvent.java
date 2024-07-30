package com.lae.dhr.lookatevet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "tb_Reservation_Events")
@Entity
public class ReservationEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_Id")
    private Integer id;

    @Column(name = "col_idEvent")
    private Integer idEvent;

    @Column(name = "col_Reservation_Time")
    private LocalDateTime reservationTime;

    @Column(name = "col_Place")
    private String place;

    @Column(name = "col_DateCreate")
    private LocalDateTime dateCreate;
    @Column(name = "col_DateUpdate")
    private LocalDateTime dateUpdate;
}
