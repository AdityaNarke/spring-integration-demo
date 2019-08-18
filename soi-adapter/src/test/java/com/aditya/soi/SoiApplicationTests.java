package com.aditya.soi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoiApplicationTests {

	@Test
	public void contextLoads() throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/fileCopy.xml", SoiApplicationTests.class);
		FileCopyDemo.displayDirectories(context);
		Thread.sleep(5000);
	}

	 

}
