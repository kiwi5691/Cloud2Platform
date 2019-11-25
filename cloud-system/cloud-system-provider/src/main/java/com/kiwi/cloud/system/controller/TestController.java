package com.kiwi.cloud.system.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author linqw
 * @2019-11-25-17:53
 */
@RestController
public class TestController {

    @NacosValue(value = "${service.name:1}", autoRefreshed = true)
    private String serverName;

    @RequestMapping(value = "/test", method = GET)
    @ResponseBody
    public String get() {
        return serverName;
    }
}


