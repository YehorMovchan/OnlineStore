package com.onlinestore.repository;

import com.onlinestore.entity.OkProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OkProductRepository extends JpaRepository<OkProduct, Long> {
}
