package top.dezckd.productservice.repository;

import org.springframework.stereotype.Repository;
import top.dezckd.productservice.entity.Product;

import java.util.*;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description ProductRepository
 */
@Repository
public class ProductRepository {

    private final Map<Long, Product> productDataStore = new HashMap<>();

    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(productDataStore.get(id));
    }

    public List<Product> findAll() {
        return new ArrayList<>(productDataStore.values());
    }

    public Product save(Product product) {
        productDataStore.put(product.id(), product);
        return product;
    }

    public void deleteById(Long id) {
        productDataStore.remove(id);
    }
}

