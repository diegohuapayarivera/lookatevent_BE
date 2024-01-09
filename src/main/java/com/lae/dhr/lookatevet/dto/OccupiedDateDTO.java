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
public class OccupiedDateDTO {

    private Integer id;

    private Integer groupId;

    private Date dateOccupied;

    private String reason;

}
