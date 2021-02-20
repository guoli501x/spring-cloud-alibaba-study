package cn.guoli.service;

import cn.guoli.domain.Order;

import java.util.List;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-14 23:44
 */
public interface OrderService {
    /**
     * 查询所以
     *
     * @return 所以
     */
    List<Order> query();

    /**
     * 创建订单
     *
     * @param order 订单
     */
    void create(String userId, String commodityCode, int count, String money);
}
