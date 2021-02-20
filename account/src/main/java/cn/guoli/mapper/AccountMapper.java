package cn.guoli.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-20 20:21
 */
@Mapper
public interface AccountMapper {
    /**
     * 查询余额
     *
     * @param userId 用户id
     * @return 余额
     */
    int select(String userId);

    /**
     * 修改余额
     *
     * @param userId 用户id
     * @param money 余额
     */
    void update(String userId, BigDecimal money);
}
