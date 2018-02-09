package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * Created by shidong.wu on 2018/2/9.
 */
@Service
public class PersonDubboConsumerService {
    @Reference(version = "1.0.0")
    PersonDubboService personDubboService;

    public void eat() {
        System.out.println(personDubboService.eat());
    }
}
