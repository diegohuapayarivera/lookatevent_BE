package com.lae.dhr.lookatevet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "tb_Events")
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_Id")
    private Integer id;

    @Column(name = "col_IdOrchestra")
    private Integer idOrchestra;

    @Column(name = "col_DateEvent")
    private LocalDate dateEvent;

    @Column(name = "col_StateEvent")
    private String stateEvent;

    @Column(name = "col_DateCreate")
    private LocalDateTime dateCreate;
    @Column(name = "col_DateUpdate")
    private LocalDateTime dateUpdate;


}
