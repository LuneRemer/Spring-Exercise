package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//annotation for testCode is for running spring
@RunWith(SpringJUnit4ClassRunner.class) 

//enroll necessary object in spring using specified class or string 
//string uses 'classpath:' or 'file:'
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") 

//make Logger(record log) as variable
@Log4j
public class SampleTests {
	
	//@Autowired : 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	//Annotation for indicating the testTarget
	@Test
	public void textExist() {
		
		//Meaning that it will be successful when restaurant is not null.
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("---------------------------------");
		log.info(restaurant.getChef());
	}
}
