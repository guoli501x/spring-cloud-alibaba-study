package cn.guoli.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @Author guoli
 * @Since 2021-02-05 23:35
 */
@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "port = " + port + ", parameter = " + string;
    }
}
