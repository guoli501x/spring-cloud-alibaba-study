package cn.guoli.service.impl;

import cn.guoli.domain.Order;
import cn.guoli.mapper.OrderMapper;
import cn.guoli.service.AccountService;
import cn.guoli.service.OrderService;
import cn.guoli.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-14 23:45
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> query() {
        return orderMapper.query();
    }

    @Override
//    @GlobalTransactional
    public void create(String userId, String commodityCode, int count, String money) {
        storageService.deduct(commodityCode, count);
        accountService.accountDeduct(userId, money);
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(count);
        order.setMoney(new BigDecimal(money));
        orderMapper.insert(order);
    }
}
