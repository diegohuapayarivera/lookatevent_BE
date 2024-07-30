package com.lae.dhr.lookatevet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

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
