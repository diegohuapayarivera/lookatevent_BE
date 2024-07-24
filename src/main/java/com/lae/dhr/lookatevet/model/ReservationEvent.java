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
@Table(name = "reservationEvent")
@Entity
public class ReservationEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer groupId;

    private Integer eventId;

    private LocalDateTime timeEvent;

    private String place;

    private String title;

    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
