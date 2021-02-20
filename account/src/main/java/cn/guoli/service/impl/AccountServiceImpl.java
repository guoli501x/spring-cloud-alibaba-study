package cn.guoli.service.impl;

import cn.guoli.mapper.AccountMapper;
import cn.guoli.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-20 20:20
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public String deduct(String userId, BigDecimal money) {
        BigDecimal count = new BigDecimal(accountMapper.select(userId));
        BigDecimal newMoney = count.subtract(money);
        int i = newMoney.compareTo(BigDecimal.ZERO);
        if (-1 == i) {
            throw new RuntimeException("余额不足");
        } else {
            accountMapper.update(userId, newMoney);
        }
        return "account deduct successful";
    }
}
