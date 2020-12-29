/*
 TimeMapper가 정상적으로 사용이 가능한지 알아보기 위한 Test Code이다.
 정상적으로 돌아간다면 스프링 내부에는 TimeMapper 타입으로 만들어진 스프링 객체(빈)이 존재한다는 뜻이다. 
 */

package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
		
		log.info("getTime2");
		log.info(timeMapper.getTime2());
	}
	
}
