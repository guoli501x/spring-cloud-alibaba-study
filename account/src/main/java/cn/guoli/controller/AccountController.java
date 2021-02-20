package cn.guoli.controller;

import cn.guoli.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-20 20:13
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/account/deduct")
    public String accountDeduct(@RequestParam String userId, @RequestParam String money) {
        return accountService.deduct(userId, new BigDecimal(money));
    }
}
