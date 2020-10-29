package com.xubo.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xubo.common.utils.PageUtils;
import com.xubo.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 11:01:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

