package cn.guoli.controller;

import cn.guoli.domain.Order;
import cn.guoli.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-14 23:43
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/query")
    public String query() {
        List<Order> query = orderService.query();
        for (Order order: query) {
             System.out.println(order.toString());
        }
        return "successful";
    }

    @PostMapping("/create")
    public String createOrder(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam int count,
                              @RequestParam String money) {
        orderService.create(userId, commodityCode, count, money);
        return "create order successful";
    }
}
