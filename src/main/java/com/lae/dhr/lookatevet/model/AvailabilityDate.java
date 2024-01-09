package com.lae.dhr.lookatevet.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "availabilityDates")
@Entity
public class AvailabilityDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer groupId;

    private Date dateEvent;

    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

}
