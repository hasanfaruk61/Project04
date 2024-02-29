package com.demo.project04.repository;

import com.demo.project04.dto.ProductInfoResponseDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<ProductInfoResponseDto> {

    @Override
    public ProductInfoResponseDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductInfoResponseDto productInfoResponseDto = new ProductInfoResponseDto();
        productInfoResponseDto.setName(rs.getString("NAME"));
        productInfoResponseDto.setCategory(rs.getString("CATEGORY"));
        productInfoResponseDto.setPhotoUrl(rs.getString("PHOTO_URL"));
        productInfoResponseDto.setDescription(rs.getString("DESCRIPTION"));
        productInfoResponseDto.setPrice(rs.getString("PRICE"));

        return productInfoResponseDto;
    }
}
