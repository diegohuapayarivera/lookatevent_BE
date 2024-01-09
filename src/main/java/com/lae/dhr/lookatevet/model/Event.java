package com.lae.dhr.lookatevet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "event")
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer groupId;

    private Date dateReservation;

    private String title;

    private String place;

    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;


}
