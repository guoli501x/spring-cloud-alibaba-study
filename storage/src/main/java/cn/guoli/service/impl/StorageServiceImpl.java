package cn.guoli.service.impl;

import cn.guoli.mapper.StorageMapper;
import cn.guoli.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-19 23:42
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    public String deduct(String commodityCode, int count) {
        int num = storageMapper.select(commodityCode);
        int newCount = num - count;
        if (newCount < 0) {
            throw new RuntimeException("仓储不够");
        } else {
            storageMapper.update(commodityCode, newCount);
        }
        return "storage deduct successful";
    }
}
