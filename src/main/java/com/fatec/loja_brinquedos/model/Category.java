package com.fatec.loja_brinquedos.model;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
public class Category {
  @Id  
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "category_id")
  private int id;

  private String name;


}
