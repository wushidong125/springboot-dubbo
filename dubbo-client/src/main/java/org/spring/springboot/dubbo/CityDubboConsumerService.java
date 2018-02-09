package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.springframework.stereotype.Service;

/**
 * Created by shidong.wu on 2018/2/8.
 */
@Service
public class CityDubboConsumerService {

    // 生成远程服务代理，可以像本地bean一样使用cityDubboService
    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);  // RPC 远程方法调用
        System.out.println(city.toString());
    }


    public void sayHello () {
        System.out.println(cityDubboService.sayHello());   // RPC 远程方法调用
    }
}
