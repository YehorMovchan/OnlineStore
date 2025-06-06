package com.khai.controller;

import com.khai.entity.OkProduct;
import com.khai.service.OkProductService;
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
    public OkProduct findById(@PathVariable long id) {
        return okProductService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        okProductService.deleteById(id);
    }
    @PostMapping
    public OkProduct save(@RequestBody OkProduct okProduct) {
        return okProductService.save(okProduct);
    }

}
