package com.example.cristiano.domain;

import java.sql.Timestamp;

public class MediaCluesSellCarInfo {
	private Integer id;
	/**
	 * 来源的关联id
	 */
	private String sourceId;
	/**
	 * 来源，这边指买车线索之前的辅助信息比如评估信息的code
	 */
	private String source;
	
	private String media;
	
	private String shopIds;
	
	private String phone;
	
	private String city;
	
	private String cityName;
	
	private String carName;
	/**
	 * 是否重复1：是，0：否
	 */
	private String isRepeat;
	/**
	 * 分数
	 */
	private String score;
	
	private String spm;
	
	private String spmFirst;
	
	private String spmSecond;
	
	private String spmThird;
	
	private String mileage;
	
	/**
	 * 首次上牌时间
	 */
	private String firstBoardingTime;
	
	private String brand;

	private String series;
	
	private String model;
	/**
	 * 评估价
	 */
	private String assessPrice;
	
	private Integer remainPlace;
	
	private String clueType;

	private Integer debug;
	/**
	 * souche车型名信息json
	 */
	private String carNameSouche;
	
	/**
	 * 支付宝用户ID
	 */
	private String alipayUserId;
	
	/**
	 * 支付宝车主平台车型ID
	 */
	private String alipayModelId;

	private Timestamp dateCreate;
	
	private Timestamp dateUpdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getShopIds() {
		return shopIds;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getIsRepeat() {
		return isRepeat;
	}

	public void setIsRepeat(String isRepeat) {
		this.isRepeat = isRepeat;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getSpm() {
		return spm;
	}

	public void setSpm(String spm) {
		this.spm = spm;
	}

	public String getSpmFirst() {
		return spmFirst;
	}

	public void setSpmFirst(String spmFirst) {
		this.spmFirst = spmFirst;
	}

	public String getSpmSecond() {
		return spmSecond;
	}

	public void setSpmSecond(String spmSecond) {
		this.spmSecond = spmSecond;
	}

	public String getSpmThird() {
		return spmThird;
	}

	public void setSpmThird(String spmThird) {
		this.spmThird = spmThird;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getFirstBoardingTime() {
		return firstBoardingTime;
	}

	public void setFirstBoardingTime(String firstBoardingTime) {
		this.firstBoardingTime = firstBoardingTime;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAssessPrice() {
		return assessPrice;
	}

	public void setAssessPrice(String assessPrice) {
		this.assessPrice = assessPrice;
	}

	public Integer getRemainPlace() {
		return remainPlace;
	}

	public void setRemainPlace(Integer remainPlace) {
		this.remainPlace = remainPlace;
	}

	public String getClueType() {
		return clueType;
	}

	public void setClueType(String clueType) {
		this.clueType = clueType;
	}

	public Integer getDebug() {
		return debug;
	}

	public void setDebug(Integer debug) {
		this.debug = debug;
	}

	public String getCarNameSouche() {
		return carNameSouche;
	}

	public void setCarNameSouche(String carNameSouche) {
		this.carNameSouche = carNameSouche;
	}

	public String getAlipayUserId() {
		return alipayUserId;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	
	public String getAlipayModelId() {
		return alipayModelId;
	}

	public void setAlipayModelId(String alipayModelId) {
		this.alipayModelId = alipayModelId;
	}

	public Timestamp getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Timestamp dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Timestamp getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Timestamp dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

}
