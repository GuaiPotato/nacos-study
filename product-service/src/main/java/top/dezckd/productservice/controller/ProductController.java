package top.dezckd.productservice.controller;

import org.springframework.web.bind.annotation.*;
import top.dezckd.productservice.entity.Product;
import top.dezckd.productservice.service.ProductService;

import java.util.List;
import java.util.Optional;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description ProductController
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
