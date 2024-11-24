package com.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {

	private static final Logger loggerr = LoggerFactory.getLogger(DevopsApplicationTests.class);
	
	@Test
	void contextLoads() {
		loggerr.info("Testing Cases Running..");
		assertEquals(true, true);
	}

}
