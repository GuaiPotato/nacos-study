package top.dezckd.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dezckd.orderservice.dto.OrderDTO;
import top.dezckd.orderservice.service.OrderService;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description OrderController
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public String createOrder(@RequestBody OrderDTO orderDTO) {
        orderService.processOrderAsync(orderDTO);
        return "Order processing started";
    }
}
