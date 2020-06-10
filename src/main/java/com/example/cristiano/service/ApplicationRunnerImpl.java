package com.example.cristiano.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component("applicationRunnerImpl")
@Order(value=1)
public class ApplicationRunnerImpl implements ApplicationRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		boolean debug=args.containsOption("debug");
		logger.info("debug1:   "+debug);
		logger.info("debug2:   "+debug);

	}

}
