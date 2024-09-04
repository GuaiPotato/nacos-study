package top.dezckd.productservice.service;

import org.springframework.stereotype.Service;
import top.dezckd.productservice.entity.Product;

import java.util.List;
import java.util.Optional;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description ProductService
 */
public interface ProductService {
    Optional<Product> getProductById(Long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void deleteProduct(Long id);
}
