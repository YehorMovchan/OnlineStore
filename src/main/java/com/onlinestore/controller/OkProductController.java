package com.onlinestore.controller;

import com.onlinestore.entity.OkProduct;
import com.onlinestore.service.OkProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class OkProductController {
    private final OkProductService okProductService;
    public OkProductController(OkProductService okProductService) {
        this.okProductService = okProductService;
    }
    @GetMapping
    public List<OkProduct> findAll() {
        return okProductService.findAll();
    }
    @GetMapping("/{id}")
    public OkProduct findById(@PathVariable int id) {
        return okProductService.findById(id);
    }
    @PostMapping
    public OkProduct save(@RequestBody OkProduct okProduct) {
        return okProductService.save(okProduct);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        okProductService.deleteById(id);
    }
}
