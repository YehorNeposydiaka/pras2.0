package com.shop.pras.Repository;

import com.shop.pras.Models.Base;
import com.shop.pras.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    // По объекту Base
    List<Category> findByBase(Base base);

    // По login базы
    List<Category> findByBase_BaseLogin(String baseLogin);
}
