package com.demo.project04.service;

import com.demo.project04.dto.ProductInfoResponseDto;
import com.demo.project04.repository.ProductMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final JdbcTemplate jdbcTemplate;

    public ProductService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductInfoResponseDto> getProductsByCategory(String category) {

        return jdbcTemplate.query("select * from products where CATEGORY = ?", new Object[]{category}, new ProductMapper());
    }
}
