package org.laocat.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.laocat.api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lao Cat ~ laocat308@outlook.com
 * @Date: 2022/4/26
 */
@RestController
public class HelloController {

    /**
     * (version = "${demo.service.version}")
     */
    @Reference(version = "1.0")
    private HelloService helloService;


    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}
