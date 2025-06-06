package com.khai.Repository;

import com.khai.entity.OkProduct;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OkProductRepository extends JpaRepository<OkProduct, Long> {
}
