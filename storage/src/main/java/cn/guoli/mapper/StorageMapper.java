package cn.guoli.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-19 23:44
 */
@Mapper
public interface StorageMapper {
    /**
     * 根据商品编号查询商品数量
     *
     * @param commodityCode 商品编号
     * @return 商品数量
     */
    int select(String commodityCode);

    /**
     * 根据商品编号查修改商品数量
     *
     * @param commodityCode 商品编号
     * @param newCount 商品数量
     */
    void update(String commodityCode, int newCount);
}
