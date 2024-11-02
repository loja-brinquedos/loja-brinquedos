package com.fatec.loja_brinquedos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.loja_brinquedos.model.Category;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> getCategoryById(Long id);
}
