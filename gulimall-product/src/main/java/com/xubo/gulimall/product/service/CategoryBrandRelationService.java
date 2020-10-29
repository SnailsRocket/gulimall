package com.xubo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xubo.common.utils.PageUtils;
import com.xubo.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:03:06
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

