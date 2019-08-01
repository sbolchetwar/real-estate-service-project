package app.dto;

public class FlatOwner {
	
	private Integer ownerId;
	private String ownerName;
	private String mobile;
	
	public FlatOwner() {
		this.ownerId = 000;
		this.ownerName = "";
		this.mobile = "";
	}
	
	public FlatOwner(int ownerId,String ownerName,String mobile) {
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.mobile = "";
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
