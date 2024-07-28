package com.lae.dhr.lookatevet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "tb_Orchestras")
@Entity
public class Orchestra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_Id")
    private Integer id;

    @Column(name = "col_Name")
    private String name;

    @Column(name = "col_Email")
    private String email;

    @Column(name = "col_Description")
    private String description;

    @Column(name = "col_Date_Create")
    private LocalDateTime dateCreate;

    @Column(name = "col_Date_Update")
    private LocalDateTime dateUpdate;

}
