package cn.guoli.mapper;

import cn.guoli.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-14 23:29
 */
@Mapper
public interface OrderMapper {
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
    void insert(Order order);
}
