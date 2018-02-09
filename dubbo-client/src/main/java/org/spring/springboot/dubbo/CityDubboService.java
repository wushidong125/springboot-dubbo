package org.spring.springboot.dubbo;

import org.spring.springboot.domain.City;

/**
 * Created by shidong.wu on 2018/2/8.
 */
public interface CityDubboService {


    City findCityByName(String cityName);

    String sayHello();
}
