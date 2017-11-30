package com.example.cristiano.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.cristiano.domain.MediaCluesSellCarInfo;
@Mapper
public interface MediaCluesSellCarInfoMapper {
	public List<MediaCluesSellCarInfo> queryCarSellClues(Map<String, Object> params);
}
