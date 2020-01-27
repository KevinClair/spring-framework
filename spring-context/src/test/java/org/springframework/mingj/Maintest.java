package org.springframework.mingj;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mingj.config.ApplicationConfiguration;
import org.springframework.mingj.service.IHelloService;

/**
 * @version 1.0
 * @ClassName Maintest
 * @Description TODO描述
 * @Author mingj
 * @Date 2020/1/27 21:03
 **/
public class Maintest {

	@Test
	public void text(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.getBean(IHelloService.class).test();
	}
}
