package cn.guoli.service.impl;

import cn.guoli.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * ConsumerService的fallback
 *
 * @Author guoli
 * @Since 2021-02-13 19:02
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String sentinelTest() {
        return "下游服务异常-";
    }
}
