package com.project.advertisement.model;

public class Advertisement {

	private int bidValue;
	private double budget;
	private double remainingBuget;
	private int startAge;
	private int endAge;
	private String adMessage;
	private String advertiserName;
	private String adName;
	private String gender;

	public int getBidValue() {
		return bidValue;
	}

	public void setBidValue(int bidValue) {
		this.bidValue = bidValue;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getStartAge() {
		return startAge;
	}

	public void setStartAge(int startAge) {
		this.startAge = startAge;
	}

	public int getEndAge() {
		return endAge;
	}

	public void setEndAge(int endAge) {
		this.endAge = endAge;
	}

	public String getAdMessage() {
		return adMessage;
	}

	public void setAdMessage(String adMessage) {
		this.adMessage = adMessage;
	}

	public String getAdvertiserName() {
		return advertiserName;
	}

	public void setAdvertiserName(String advertiserName) {
		this.advertiserName = advertiserName;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public double getRemainingBuget() {
		return remainingBuget;
	}

	public void setRemainingBuget(double remainingBuget) {
		this.remainingBuget = remainingBuget;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Advertisement [bidValue=" + bidValue + ", budget=" + budget + ", startAge=" + startAge + ", endAge="
				+ endAge + ", adMessage=" + adMessage + ", advertiserName=" + advertiserName + "]";
	}

}
