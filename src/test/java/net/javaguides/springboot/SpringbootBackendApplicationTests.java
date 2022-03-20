package net.javaguides.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringbootBackendApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringbootBackendApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("TEST CASE EXECUTING...");
		assertEquals(true,true);
		
	}


}
