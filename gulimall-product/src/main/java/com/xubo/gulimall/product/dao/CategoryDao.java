package com.xubo.gulimall.product.dao;

import com.xubo.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:03:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
