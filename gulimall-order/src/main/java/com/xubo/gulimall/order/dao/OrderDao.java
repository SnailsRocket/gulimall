package com.xubo.gulimall.order.dao;

import com.xubo.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:01:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
