package top.dezckd.orderservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.dezckd.orderservice.dto.OrderDTO;

import java.util.concurrent.CompletableFuture;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description OrderService
 */
@Service
public class OrderService {

    private final RestTemplate restTemplate;

    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CompletableFuture<String> fetchUserInfoAsync(String userId) {
        return CompletableFuture.supplyAsync(() ->
                restTemplate.getForObject("http://user-service/user/" + userId, String.class)
        );
    }

    public CompletableFuture<String> fetchProductInfoAsync(String productId) {
        return CompletableFuture.supplyAsync(() ->
                restTemplate.getForObject("http://product-service/product/" + productId, String.class)
        );
    }

    public void processOrderAsync(OrderDTO orderDTO) {
        var userInfoFuture = fetchUserInfoAsync(orderDTO.userId());
        var productInfoFuture = fetchProductInfoAsync(orderDTO.productId());

        userInfoFuture.thenAcceptBoth(productInfoFuture, (userInfo, productInfo) -> {
            System.out.println("Order processed with User: " + userInfo + " and Product: " + productInfo);
        });
    }
}
