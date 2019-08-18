package com.aditya.soi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoiStreamApplicationTests {

	@Test
	public void contextLoads() {
		  ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/messageStream.xml", SoiStreamApplicationTests.class);
			  while (true) {
			  }
			 
	}
	

}
