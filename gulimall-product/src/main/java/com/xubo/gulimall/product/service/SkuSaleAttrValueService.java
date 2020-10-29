package com.xubo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xubo.common.utils.PageUtils;
import com.xubo.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:03:06
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

