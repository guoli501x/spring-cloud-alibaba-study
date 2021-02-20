package cn.guoli.service;

import java.math.BigDecimal;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-20 20:14
 */
public interface AccountService {
    /**
     * 修改余额
     *
     * @param userId 用户id
     * @param money 余额
     * @return 修改成功失败信息
     */
    String deduct(String userId, BigDecimal money);
}
