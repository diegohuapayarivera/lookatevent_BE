package com.lae.dhr.lookatevet.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationEventDTO {

    private Integer id;

    private Integer idEvent;

    private LocalDateTime reservationTime;

    private String place;

}
