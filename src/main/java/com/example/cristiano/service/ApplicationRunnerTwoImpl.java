package com.example.cristiano.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component("applicationRunnerTwoImpl")
@Order(value=2)
public class ApplicationRunnerTwoImpl implements ApplicationRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		boolean debug=args.containsOption("debug");
		logger.info("debug2:   "+debug);

	}

}
