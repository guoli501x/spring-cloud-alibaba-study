package cn.guoli.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-14 22:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;

    private String userId;

    private String commodityCode;

    private int count;

    private BigDecimal money;
}
