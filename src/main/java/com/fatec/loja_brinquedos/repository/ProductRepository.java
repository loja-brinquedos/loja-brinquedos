package com.fatec.loja_brinquedos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.fatec.loja_brinquedos.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByCategoryId(int categoryId);
}
