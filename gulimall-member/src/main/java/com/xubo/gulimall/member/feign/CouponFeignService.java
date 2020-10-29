package com.xubo.gulimall.member.feign;

import com.xubo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Xubo
 * @Date: 2020/10/29 19:54
 * 声明式远程调用接口
 * 当我们调用该接口的时候，先去nacos里面找到gulimall-coupon,然后调用/coupon/coupon/member/list这个控制器
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
