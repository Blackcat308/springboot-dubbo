package org.laocat.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.laocat.api.service.HelloService;
import org.laocat.api.service.HiService;

/**
 * version = "${demo.service.version}"
 */

/**
 * @Author: Lao Cat ~ laocat308@outlook.com
 * @Date: 2022/4/26
 */
@Service(version = "1.0")
public class HiServiceImpl implements HiService {

    @Override
    public String sayHi(String name) {
        return "hi" + name + "; request success";
    }
}
