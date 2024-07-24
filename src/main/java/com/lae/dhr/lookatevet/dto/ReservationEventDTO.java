package com.lae.dhr.lookatevet.dto;

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

    private Integer groupId;

    private Integer eventId;

    private LocalDateTime timeEvent;

    private String place;

    private String title;
}
