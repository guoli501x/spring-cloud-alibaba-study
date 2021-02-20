package cn.guoli.service;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-19 23:36
 */
public interface StorageService {
    /**
     * 扣除商品数量
     *
     * @param commodityCode 商品编号
     * @param count 商品数量
     * @return 成功失败信息
     */
    String deduct(String commodityCode, int count);
}
