package cn.guoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-06 2:09
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication80.class, args);
    }
}
