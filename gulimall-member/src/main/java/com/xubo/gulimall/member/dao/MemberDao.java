package com.xubo.gulimall.member.dao;

import com.xubo.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xubo
 * @email 1837039333@qq.com
 * @date 2020-10-25 15:55:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
