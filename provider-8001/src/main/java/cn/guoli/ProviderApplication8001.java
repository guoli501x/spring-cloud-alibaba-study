package cn.guoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @Author guoli
 * @Since 2021-02-05 23:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8001.class, args);
    }
}
