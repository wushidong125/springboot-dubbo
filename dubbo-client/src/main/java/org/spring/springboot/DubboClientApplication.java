package org.spring.springboot;

import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.spring.springboot.dubbo.PersonDubboConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DubboClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =  SpringApplication.run(DubboClientApplication.class, args);
		CityDubboConsumerService cityDubboConsumerService = run.getBean(CityDubboConsumerService.class);

		PersonDubboConsumerService personDubboConsumerService = run.getBean(PersonDubboConsumerService.class);
		cityDubboConsumerService.printCity();
		cityDubboConsumerService.sayHello();
		personDubboConsumerService.eat();

	}
}
