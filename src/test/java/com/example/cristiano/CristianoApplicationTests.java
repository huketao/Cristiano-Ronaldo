package com.example.cristiano;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.example.cristiano.dao.MediaCluesSellCarInfoMapper;
import com.example.cristiano.domain.MediaCluesSellCarInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CristianoApplicationTests {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MediaCluesSellCarInfoMapper mediaCluesSellCarInfoMapper;

	@Test
	public void testQueryCarSellClues() {
		HashMap<String, Object> params=new HashMap<String, Object>();
		params.put("debug", 0);
		List<MediaCluesSellCarInfo> resulList=mediaCluesSellCarInfoMapper.queryCarSellClues(params);
		logger.info("resulList size:  "+resulList.size());
		logger.info("first carSellClues: "+JSON.toJSONString(resulList.get(0)));
		
	}

}
