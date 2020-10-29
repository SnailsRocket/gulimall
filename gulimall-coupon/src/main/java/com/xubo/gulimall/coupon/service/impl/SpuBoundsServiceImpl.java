package com.xubo.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xubo.common.utils.PageUtils;
import com.xubo.common.utils.Query;

import com.xubo.gulimall.coupon.dao.SpuBoundsDao;
import com.xubo.gulimall.coupon.entity.SpuBoundsEntity;
import com.xubo.gulimall.coupon.service.SpuBoundsService;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}