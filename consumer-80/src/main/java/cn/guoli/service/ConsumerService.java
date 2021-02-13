package cn.guoli.service;

import cn.guoli.service.impl.ConsumerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-06 2:11
 */
@FeignClient(value = "service-provider", fallback = ConsumerServiceImpl.class)
public interface ConsumerService {
    /**
     * 添加penFeign后对@sentinelResource测试
     *
     * @return 结果
     */
    @GetMapping("/sentinel/test")
    String sentinelTest();
}
