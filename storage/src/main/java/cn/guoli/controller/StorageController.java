package cn.guoli.controller;

import cn.guoli.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @Author guoli
 * @Since 2021-02-19 23:30
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    @PostMapping("/storage/deduct")
    public String deduct(@RequestParam String commodityCode, @RequestParam int count) {
        return storageService.deduct(commodityCode, count);
    }
}
