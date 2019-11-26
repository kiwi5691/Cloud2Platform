package com.kiwi.cloud.system;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author linqw
 * @2019-11-25-16:28
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.kiwi.cloud.system"})
@RestController
@EnableDiscoveryClient
public class ProviderApplication {


    @Value("${spring.cloud.nacos.discovery.server-addr}")
    public static String aaa;
    @Value("${server.port}")
    public static String tt;

    static {
        System.out.println(tt);
        System.out.println(aaa);
    }


    public static void main(String[] args) {


        log.info("init center");
        SpringApplication.run(ProviderApplication.class,args);
    }



}
