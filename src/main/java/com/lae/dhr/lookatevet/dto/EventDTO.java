package com.lae.dhr.lookatevet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventDTO {

    private Integer id;

    private Integer groupId;

    private Date dateReservation;

    private String title;

    private String place;
}
