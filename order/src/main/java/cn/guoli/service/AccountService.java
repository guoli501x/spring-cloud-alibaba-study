package cn.guoli.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-20 21:24
 */
@FeignClient("service-account")
public interface AccountService {
    @PostMapping("/account/deduct")
    String accountDeduct(@RequestParam String userId, @RequestParam String money);
}
