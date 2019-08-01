package app.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import app.datastore.RSAppDB;
import app.dto.FlatOwner;
import app.dto.FlatRegistraionDetails;

public class FlatRegistrationDAOImpl implements FlatRegistrationDAO {
	private Map<Integer, FlatRegistraionDetails> registrationMap = RSAppDB.getFlatRegistrationMap();
	private Map<Integer, FlatOwner> flatOwnerMap = RSAppDB.getFlatOwnerMap();
	@Override
	public FlatRegistraionDetails registerFlat(FlatRegistraionDetails registrationDetails) {
		registrationMap.put(registrationDetails.getRegistrationId(), registrationDetails);
		return registrationMap.get(registrationDetails.getRegistrationId());
	}

	@Override
	public List<Integer> getAllOwnerIds() {
		List<Integer> ownerIdList = new ArrayList<Integer>();
		for(Integer id : flatOwnerMap.keySet()) {
			ownerIdList.add(id);
		}
		return ownerIdList;
	}

	@Override
	public List<FlatRegistraionDetails> getRegistrationList() {
		List<FlatRegistraionDetails> regiList = new ArrayList<FlatRegistraionDetails>();
		for(Integer regiId : registrationMap.keySet()) {
			regiList.add(registrationMap.get(regiId));
		}		
		return regiList;
	}

}
