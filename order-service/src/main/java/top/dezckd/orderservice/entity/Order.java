package top.dezckd.orderservice.entity;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description Order
 */
public record Order(String id, String userId, String productId, int quantity) {}
