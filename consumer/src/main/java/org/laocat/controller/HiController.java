package org.laocat.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.laocat.api.service.HelloService;
import org.laocat.api.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lao Cat ~ laocat308@outlook.com
 * @Date: 2022/4/26
 */
@RestController
public class HiController {

    /**
     * (version = "${demo.service.version}")
     */
    @Reference(version = "1.0")
    private HiService hiService;


    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable String name) {
        return hiService.sayHi(name);
    }
}
