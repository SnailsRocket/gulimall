package com.xubo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xubo.common.utils.PageUtils;
import com.xubo.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:03:06
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

