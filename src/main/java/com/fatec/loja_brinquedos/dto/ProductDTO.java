package com.fatec.loja_brinquedos.dto;


import lombok.Data;

@Data
public class ProductDTO {
    private int id;
    private String name;
    private int categoryId;
    private Double price;
    private Double weight;
    private String description;
    private String imageName;
}
