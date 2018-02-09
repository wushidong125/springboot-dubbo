package org.spring.springboot.dubbo.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;

/**
 * Created by shidong.wu on 2018/2/8.
 */
@Service(version = "1.0.0")
public class CityDubboServiceimpl implements CityDubboService {

    @Override
    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }

    @Override
    public String sayHello() {
        return "hello i am server methods";
    }
}
