package top.dezckd.productservice.entity;

import java.math.BigDecimal;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description Product
 */
public record Product(
        Long id,
        String name,
        BigDecimal price,
        Integer stock
) {}
