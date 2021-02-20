package cn.guoli.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-20 21:20
 */
@FeignClient("service-storage")
public interface StorageService {
    @PostMapping("/storage/deduct")
    String deduct(@RequestParam String commodityCode, @RequestParam int count);
}
