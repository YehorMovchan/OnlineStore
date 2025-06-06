package com.khai.service;

import com.khai.Repository.OkProductRepository;
import com.khai.entity.OkProduct;
import jakarta.validation.constraints.Null;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OkProductService {

    private final OkProductRepository okProductRepository;

    public OkProductService(OkProductRepository okProductRepository) {
        this.okProductRepository = okProductRepository;
    }

    public List<OkProduct> findAll() {
        return okProductRepository.findAll();
    }

    public OkProduct findById(long id) {
        return okProductRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        okProductRepository.deleteById(id);
    }

    public OkProduct save(OkProduct okProduct) {
        return okProductRepository.save(okProduct);
    }
}
