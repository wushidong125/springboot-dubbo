package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.dubbo.PersonDubboService;

/**
 * Created by shidong.wu on 2018/2/9.
 */
@Service(version = "1.0.0")
public class PersonDubboServiceimpl implements PersonDubboService {
    @Override
    public String eat() {
        return " i am person, i like eat ......";
    }
}
