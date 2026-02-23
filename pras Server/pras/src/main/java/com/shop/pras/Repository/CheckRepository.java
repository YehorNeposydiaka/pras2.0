package com.shop.pras.Repository;
import com.shop.pras.Models.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends JpaRepository<Check, Integer> {
}
