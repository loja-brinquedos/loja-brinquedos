package com.fatec.loja_brinquedos.model;

import lombok.Data;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity 
@Data
@Table(name = "roles")
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}
