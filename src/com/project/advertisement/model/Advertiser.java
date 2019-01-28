package com.project.advertisement.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advertiser {

	private String name;
	private String address;
	private Map<String, Advertisement> ads = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Advertisement> getAllAd() {
		return (List<Advertisement>) ads.values();
	}

	public Advertisement addAdvertisement(Advertisement ad) {
		return ads.put(ad.getAdName(), ad);

	}

	@Override
	public String toString() {
		return "Advertiser [name=" + name + ", address=" + address + "]";
	}

}
