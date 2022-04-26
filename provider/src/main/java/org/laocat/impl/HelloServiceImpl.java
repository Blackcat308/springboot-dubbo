package org.laocat.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.laocat.api.service.HelloService;

/**
 * version = "${demo.service.version}"
 */

/**
 * @Author: Lao Cat ~ laocat308@outlook.com
 * @Date: 2022/4/26
 */
@Service(version = "1.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello" + name + "; request success";
    }
}
