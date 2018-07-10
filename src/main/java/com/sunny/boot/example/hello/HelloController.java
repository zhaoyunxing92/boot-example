/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package com.sunny.boot.example.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoyunxing
 * @class: com.sunny.boot.example.hello.HelloController
 * @date: 2018-07-09 16:16
 * @des:
 */
@RestController
@RequestMapping("/ecall")
public class HelloController {
    /**
     * 回调
     *
     * @return
     */
    @PostMapping("/back")
    public String callback() {
        return "hello";
    }

    /**
     * 根据订单id获取订单信息
     *
     * @return
     */
    @PostMapping("/orderInfo")
    public String getEcallOrderInfoById(@RequestParam("orderId") String orderId) {
        return "hello";
    }
}
