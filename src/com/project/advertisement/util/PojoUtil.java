package com.project.advertisement.util;

import com.project.advertisement.model.Advertisement;
import com.project.advertisement.model.Advertiser;
import com.project.advertisement.model.User;

public class PojoUtil {

	public static Advertiser formAdvertiser(String input) {
		String[] tmp = input.split("\\s+");
		Advertiser advertiser = new Advertiser();
		advertiser.setName(tmp[0]);
		advertiser.setAddress(tmp[1]);
		return advertiser;
	}

	public static User formUser(String input) {
		String[] tmp = input.split("\\s+");
		User user = new User();
		user.setUserId(tmp[0]);
		user.setUserName(tmp[1]);
		user.setAge(Integer.parseInt(tmp[2]));
		user.setGender(tmp[3]);

		return user;
	}

	public static Advertisement formAdvertisement(String input) throws Exception {
		String[] tmp = input.split("\\s+");
		double budget = Double.parseDouble(tmp[5]);
		// "AdvertiserName AdvertisementName bidvalue startAge endAge message budget
		// gender"
		Advertisement advertisement = new Advertisement();
		advertisement.setAdvertiserName(tmp[0]);
		advertisement.setAdName(tmp[1]);
		advertisement.setBidValue(Integer.parseInt(tmp[2]));
		advertisement.setStartAge(Integer.parseInt(tmp[3]));
		advertisement.setEndAge(Integer.parseInt(tmp[4]));
		advertisement.setAdMessage(null);

		advertisement.setBudget(budget);
		advertisement.setRemainingBuget(budget);
		advertisement.setGender(tmp[6]);
		return advertisement;
	}
}
