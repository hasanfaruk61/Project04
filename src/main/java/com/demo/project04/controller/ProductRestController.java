package com.demo.project04.controller;

import com.demo.project04.dto.ProductInfoResponseDto;
import com.demo.project04.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("getProductsByCategory")
    public List<ProductInfoResponseDto> getProductsByCategory(@RequestParam String category) {
        return productService.getProductsByCategory(category);
    }

}
