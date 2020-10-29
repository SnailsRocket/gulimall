package com.xubo.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xubo.gulimall.product.entity.BrandEntity;
import com.xubo.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("保存测试！");
//        brandEntity.setName("小米");
//        brandService.save(brandEntity);

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("修改测试！");
        brandService.updateById(brandEntity);


        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        System.out.println(brandList.size());
    }

}
