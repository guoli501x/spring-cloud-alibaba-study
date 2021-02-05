package cn.guoli.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-06 2:15
 */
@Configuration
public class RestTemplateConfig {
    /**
     * 注入 RestTemplate
     * 注解@LoadBalanced 使用负载均衡
     *
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
