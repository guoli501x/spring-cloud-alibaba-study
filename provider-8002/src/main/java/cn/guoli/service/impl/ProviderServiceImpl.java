package cn.guoli.service.impl;

import cn.guoli.service.ProviderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-09 20:00
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Value("${server.port}")
    private String port;

    @Override
    @SentinelResource(value = "sentinelTest", blockHandler = "blockHandler", fallback = "fallback")
    public String sentinelTest() {
        throw new NullPointerException("空指针异常");
//        return "port: " + port + " sentinel test successful!";
    }

    public String blockHandler(BlockException exception) {
        return "port: " + port + " blockHandler!";
    }

    public String fallback() {
        return "port: " + port + " fallback!";
    }
}
