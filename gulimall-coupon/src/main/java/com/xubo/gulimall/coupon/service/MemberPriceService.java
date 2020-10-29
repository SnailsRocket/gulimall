package com.xubo.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xubo.common.utils.PageUtils;
import com.xubo.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 15:43:58
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

