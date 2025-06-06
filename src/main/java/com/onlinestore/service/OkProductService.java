package com.onlinestore.service;

import com.onlinestore.entity.OkProduct;
import com.onlinestore.repository.OkProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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
    public OkProduct save(OkProduct okProduct) {
        return okProductRepository.save(okProduct);
    }
    public void deleteById(long id) {
        okProductRepository.deleteById(id);
    }

}
