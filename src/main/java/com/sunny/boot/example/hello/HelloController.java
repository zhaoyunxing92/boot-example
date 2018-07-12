/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package com.sunny.boot.example.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

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
    public String callback(HttpServletRequest request) {
        //{"note":"测试","accidentHappenTime":"2018-07-10 18:05:49","disposeTime":"2018-07-11 10:01:21","serviceContent":"非E-call","woNoOutside":"1531273887286","requestType":"02","extenalId":"fa463811b21cac18362eb11419d5f9d0","disposeNo":"4028818e643bb232016487141a1a06ac","channelId":"W11-test","receiptStatus":"其他（1042503）","cancleReason":"","currentDatetime":"2018-07-11 10:03:18"}
        //急救指导、协助叫120、急救指导+协助叫120、安防协助、非E-call
        String parm = getRequestParameter(request);
        // response.getWriter().write("{\"Code\":\"01\",\"Message\":\"处理成功\"}");
        return "{\"Code\":\"01\",\"Message\":\"处理成功\"}";
    }

    /**
     * 根据订单id获取订单信息
     *
     * @return
     */
    @PostMapping("/orderInfo")
    public String getEcallOrderInfoById(@RequestParam("orderId") String orderId) {
        //        BeanUtils.copyProperties();
        return "hello";
    }

    private static String getRequestParameter(HttpServletRequest request) {

        if (null == request) {
            return null;
        }

        String method = request.getMethod();
        String param = null;
        if (method.equalsIgnoreCase("GET")) {
            /**
             获取?后面的字符串
             http://127.0.0.1:8080/test?username=zhangsan&age=100
             -->username=zhangsan&age=100
             http://127.0.0.1:8080/test?{"username":"zhangsan"}
             -->{"username":"zhangsan"}是json字符串
             有了json串就可以映射成对象了
             */
            param = request.getQueryString();

            System.out.println("param:" + param);
        } else {
            param = getBodyData(request);

            System.out.println("param:" + param);
        }
        return param;
    }

    private static String getBodyData(HttpServletRequest request) {
        StringBuffer data = new StringBuffer();
        String line = null;
        BufferedReader reader = null;
        try {
            reader = request.getReader();
            while (null != (line = reader.readLine()))
                data.append(line);
        } catch (IOException ignored) {
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data.toString();
    }
}
