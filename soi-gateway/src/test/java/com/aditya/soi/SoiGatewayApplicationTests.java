package com.aditya.soi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoiGatewayApplicationTests {

	@Test
	public void contextLoads() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/gateway-transform.xml");
		StringTransformService stringTransformerInterface = 
				context.getBean("stringService", StringTransformService.class);
		String result = stringTransformerInterface.transform("converted to uppercase");
		System.out.println(result);
	}

}
