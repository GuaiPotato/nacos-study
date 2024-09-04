package top.dezckd.productservice.service.impl;

import org.springframework.stereotype.Service;
import top.dezckd.productservice.entity.Product;
import top.dezckd.productservice.repository.ProductRepository;
import top.dezckd.productservice.service.ProductService;

import java.util.List;
import java.util.Optional;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description ProductServiceImpl
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
