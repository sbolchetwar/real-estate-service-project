package app.dto;

public class FlatRegistraionDetails {
	
	private Integer registrationId;
	private Integer ownerId;
	private String flatType;
	private Integer flatArea;
	private Integer rentAmount;
	private Integer depositAmount;
	
	public FlatRegistraionDetails() {
		this.registrationId = 0;
		this.ownerId = 0;
		this.flatType = "";
		this.flatArea = 0;
		this.rentAmount = 0;
		this.depositAmount = 0;
	}

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public Integer getFlatArea() {
		return flatArea;
	}

	public void setFlatArea(Integer flatArea) {
		this.flatArea = flatArea;
	}

	public Integer getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(Integer rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Integer getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Integer depositAmount) {
		this.depositAmount = depositAmount;
	}

	@Override
	public String toString() {
		return  registrationId + " - " + ownerId + " - "
				+ flatType + " - " + flatArea + " - " + rentAmount + " - "
				+ depositAmount;
	}
	
	
	

}
