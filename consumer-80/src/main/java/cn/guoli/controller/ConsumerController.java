package cn.guoli.controller;

import cn.guoli.service.ConsumerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-06 2:11
 */
@RefreshScope
@RestController
public class ConsumerController {
    @Value("${config.info}")
    private String configInfo;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private ConsumerService consumerService;

    @GetMapping(value = "/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }

    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return configInfo;
    }

    @GetMapping(value = "/sentinel/test")
    public String sentinelTest() {
        return restTemplate.getForObject("http://service-provider/sentinel/test", String.class);
    }

    @GetMapping("/sentinel/test/feign")
    public String sentinelTestFeign() {
        return consumerService.sentinelTest();
    }
}
