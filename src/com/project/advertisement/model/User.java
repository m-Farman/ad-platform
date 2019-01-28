package com.project.advertisement.model;

import java.util.HashSet;
import java.util.Set;

public class User {

	private String userName;
	private String userId;
	private int age;
	private String gender;
	private Set<Advertisement> alreadySeenAd = new HashSet<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Advertisement> getAlreadySeenAd() {
		return alreadySeenAd;
	}

	public void setAlreadySeenAd(Set<Advertisement> alreadySeenAd) {
		this.alreadySeenAd = alreadySeenAd;
	}

}
