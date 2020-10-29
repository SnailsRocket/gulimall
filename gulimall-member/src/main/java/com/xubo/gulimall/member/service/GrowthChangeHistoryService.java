package com.xubo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xubo.common.utils.PageUtils;
import com.xubo.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 15:55:53
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

