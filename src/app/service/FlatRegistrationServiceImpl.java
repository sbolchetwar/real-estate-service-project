package app.service;

import java.util.List;

import app.dao.FlatRegistrationDAO;
import app.dao.FlatRegistrationDAOImpl;
import app.dto.FlatRegistraionDetails;
import app.exception.InvalidDepositAmtException;

public class FlatRegistrationServiceImpl implements FlatRegistrationService{
	private FlatRegistrationDAO flatRegiDAO = new FlatRegistrationDAOImpl();

	@Override
	public FlatRegistraionDetails registerFlatDetails(FlatRegistraionDetails frDetails) {
		boolean isValidData = false;
		FlatRegistraionDetails regiDetails= null;
		isValidData = validateDetails(frDetails);
		if(isValidData) {
			frDetails.setRegistrationId(generateRegisterId());
			regiDetails = flatRegiDAO.registerFlat(frDetails);
		}else {
			System.err.println("Invalid input details");
		}		
		
		return regiDetails;
	}

	private boolean validateDetails(FlatRegistraionDetails frDetails) {
		if(frDetails.getRentAmount()<frDetails.getDepositAmount()) {
			return true;
		}else {
			try {
				throw new InvalidDepositAmtException();
			} catch (InvalidDepositAmtException e) {
				System.err.println(e);
			}
		}
		return false;
	}

	private int generateRegisterId() {
		return (int) (Math.random()*1000);
	}

	@Override
	public List<Integer> getAllRegisterdOwnersId() {
		return flatRegiDAO.getAllOwnerIds();
	}

	@Override
	public List<FlatRegistraionDetails> getRegisteredFlatDetails() {
		return flatRegiDAO.getRegistrationList();
	}
	
	

}
