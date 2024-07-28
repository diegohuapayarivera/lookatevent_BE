package com.lae.dhr.lookatevet.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventDTO {

    private Integer id;

    private Integer idOrchestra;

    private LocalDate dateEvent;

    private String stateEvent;
}
