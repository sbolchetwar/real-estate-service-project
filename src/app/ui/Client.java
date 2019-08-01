package app.ui;
import java.util.List;
import java.util.Scanner;

import app.dto.FlatRegistraionDetails;
import app.service.FlatRegistrationService;
import app.service.FlatRegistrationServiceImpl;

public class Client {
	private static Scanner scan = new Scanner(System.in);
	private static FlatRegistrationService registrationService = new FlatRegistrationServiceImpl();

	public static void main(String[] args) {
		
		int ipValue = 0;
		boolean noExit = true;
		
		displayMenuScreen();	
		
		do {
			System.out.println("Enter your choice :");
			ipValue = scan.nextInt();
			if(ipValue == 1) {
				displayRegisterationScreen();
			}else if(ipValue == 2){
				displayRegisterationDetailsScreen();
			}else if(ipValue == 3){
				System.out.println("Thank you...");
				noExit=false;
			}else {
				System.err.println("Invalid option entered...");
			}
		}while(noExit);

	}

	private static void displayRegisterationDetailsScreen() {
		List<FlatRegistraionDetails> regiList = registrationService.getRegisteredFlatDetails();
		System.out.println("===============================");
		System.out.println("Regi. ID - Owner ID - Flat Type - Flat Area - Rent Amount - Depostit Amount");
		for(FlatRegistraionDetails regiDetls : regiList)
			System.out.println(regiDetls);
	}

	private static void displayRegisterationScreen() {
		int ownerId = 0;
		String flatType = "";
		int flatArea = 0;
		int rentAmount = 0;
		int depositAmount = 0;
		List<Integer> oIdList = registrationService.getAllRegisterdOwnersId();
		
		System.out.println("Existing OWner IDs Are :"+oIdList);
		System.out.println("Please enter your owner ID form above list : ");
		ownerId = scan.nextInt();
		System.out.println("Select Flat Type (1-1BHK, 2-2BHK) :");
		flatType=scan.next();
		System.out.println("Select Flat Area :");
		flatArea=scan.nextInt();
		System.out.println("Enter desired Rent Amount");
		rentAmount = scan.nextInt();
		System.out.println("Enter desired Deposit Amount");
		depositAmount = scan.nextInt();
		if(ownerId != 0 && flatType != null && rentAmount != 0 && depositAmount != 0 && flatArea != 0) {
			FlatRegistraionDetails regiDetails = new FlatRegistraionDetails();
			regiDetails.setOwnerId(ownerId);
			regiDetails.setFlatType(flatType);
			regiDetails.setRentAmount(rentAmount);
			regiDetails.setDepositAmount(depositAmount);
			regiDetails.setFlatArea(flatArea);
			regiDetails = registrationService.registerFlatDetails(regiDetails);
			if(regiDetails != null) {
				System.out.println("Flat details registered successfully... Regi ID : "+regiDetails.getRegistrationId());
			}
		}
	}

	private static void displayMenuScreen() {
		System.out.println("=========Real Estate Registration Service============");
		System.out.println("Choose option mentioned below: ");
		System.out.println("1. Register Flat");
		System.out.println("2. Display Registraion Details");
		System.out.println("3. Exit");
		System.out.println("===================================================");
	}
	

}
