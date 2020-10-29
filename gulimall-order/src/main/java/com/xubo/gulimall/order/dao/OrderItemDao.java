package com.xubo.gulimall.order.dao;

import com.xubo.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:01:18
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
