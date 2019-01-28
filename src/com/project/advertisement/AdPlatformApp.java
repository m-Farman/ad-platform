package com.project.advertisement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.project.advertisement.model.Advertisement;
import com.project.advertisement.model.Advertiser;
import com.project.advertisement.model.User;
import com.project.advertisement.repository.AdvertiserRepository;
import com.project.advertisement.repository.UserRepository;
import com.project.advertisement.service.AdvertisementService;
import com.project.advertisement.service.AdvertiserService;
import com.project.advertisement.service.UserService;
import com.project.advertisement.util.PojoUtil;

public class AdPlatformApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		AdvertiserRepository advertiserRepository = new AdvertiserRepository();
		AdvertiserService advertiserSerive = new AdvertiserService();
		AdvertisementService advertisementService = new AdvertisementService();
		UserService userService = new UserService();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		Integer inputKey = 3;
		do {
			System.out.println("Please Enter your choice");
			System.out.println("Press \n 1 for adding advertiser \n 2 for user login" + "\n 3 for adding advertisement "
					+ "\n 4 for add user " + "\n 5 for exit");
			inputKey = Integer.parseInt(br.readLine());

			switch (inputKey) {
			case 1:
				System.out.println("Please Enter following details");
				System.out.println("name address");

				input = br.readLine();
				Advertiser advertiser = PojoUtil.formAdvertiser(input);
				advertiserRepository.addAdvertisers(advertiser);
				break;
			case 2:
				System.out.println("Please Enter following details");
				System.out.println("userId");
				input = br.readLine();
				User user = UserRepository.getInstance().getUsers(input);
				String ouput = advertisementService.getAdvertisementForUser(user);
				System.out.println(ouput);
				break;
			case 3:
				System.out.println("Please Enter following details");
				System.out.println("AdvertiserName  AdvertisementName bidvalue startAge endAge message budget gender");
				input = br.readLine();
				Advertisement advertisement = null;
				try {
					advertisement = PojoUtil.formAdvertisement(input);
				} catch (Exception e) {
					System.out.println("Wrong Input given. Please give the input as mentioned in order");
					break;
				}
				System.out.println("Enter the Advertisement message");
				input = br.readLine();
				advertisement.setAdMessage(input);
				advertisementService.addAdvertisment(advertisement);
				break;
			case 4:
				System.out.println("Please Enter following details");
				System.out.println("UserId userName age gender");
				input = br.readLine();
				User user1 = PojoUtil.formUser(input);
				userService.addUser(user1);
				break;
			default:
				System.exit(0);
				break;
			}

		} while (true);

	}
}
