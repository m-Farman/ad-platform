package com.project.advertisement.repository;

import java.util.HashMap;
import java.util.Map;

import com.project.advertisement.model.Advertiser;

public class AdvertiserRepository {

	private Map<String, Advertiser> advertisers;

	public AdvertiserRepository() {
		super();
		advertisers = new HashMap<String, Advertiser>();
	}
	
	public Advertiser getAdvertisers(String name) {
		return advertisers.get(name);
	}

	public Advertiser addAdvertisers(Advertiser advertiser) {
		return advertisers.put(advertiser.getName(), advertiser);
	}

}
