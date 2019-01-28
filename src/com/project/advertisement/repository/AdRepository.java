package com.project.advertisement.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.advertisement.model.Advertisement;

public class AdRepository {

	private Map<Integer, List<Advertisement>> maleAds;
	private Map<Integer, List<Advertisement>> femaleAds;
	private static AdRepository obj;

	private AdRepository() {
		maleAds = new HashMap<>(150);
		femaleAds = new HashMap<>(150);
		for (int i = 1; i < 150; i++) {
			maleAds.put(i, null);
			femaleAds.put(i, null);
		}
	}

	public static AdRepository getInstance() {
		if (obj == null) {
			obj = new AdRepository();
		}
		return obj;

	}

	public Map<Integer, List<Advertisement>> getMaleAds() {
		return maleAds;
	}

	public Map<Integer, List<Advertisement>> getFemaleAds() {
		return femaleAds;
	}

}
