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
public class AvailabilityDateDTO {

    private Integer id;

    private Integer groupId;

    private Date dateEvent;
}
