package com.project.advertisement.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.project.advertisement.model.Advertisement;
import com.project.advertisement.model.User;
import com.project.advertisement.repository.AdRepository;

public class AdvertisementService {

	public boolean addAdvertisment(Advertisement advertisement) {

		AdRepository adRepo = AdRepository.getInstance();
		Map<Integer, List<Advertisement>> ads;
		if ("F".equals(advertisement.getGender())) {
			ads = adRepo.getFemaleAds();
		} else {
			ads = adRepo.getMaleAds();
		}

		for (int i = advertisement.getStartAge(); i <= advertisement.getEndAge(); i++) {
			List<Advertisement> dayAdvertisement = ads.get(i);
			if (dayAdvertisement == null) {
				dayAdvertisement = new ArrayList<>();
			}
			dayAdvertisement.add(advertisement);
			ads.put(i, dayAdvertisement);
		}

		return true;
	}

	public String getAdvertisementForUser(User user) {
		AdRepository adRepo = AdRepository.getInstance();
		Map<Integer, List<Advertisement>> ads;
		if ("F".equals(user.getGender())) {
			ads = adRepo.getFemaleAds();
		} else {
			ads = adRepo.getMaleAds();
		}

		List<Advertisement> dayAdvertisement = ads.get(user.getAge());
		if (dayAdvertisement != null) {
			dayAdvertisement.sort(Comparator.comparing(Advertisement::getBidValue).reversed());
			Advertisement ad = null;
			for (Advertisement advertisement : dayAdvertisement) {
				if (advertisement.getRemainingBuget() - advertisement.getBidValue() > 0
						&& !user.getAlreadySeenAd().contains(advertisement)) {
					advertisement.setRemainingBuget(advertisement.getRemainingBuget() - advertisement.getBidValue());
					user.getAlreadySeenAd().add(advertisement);
					return advertisement.getAdMessage();

				}
			}
		}

		return "Opss! no advertisement found";
	}
}
