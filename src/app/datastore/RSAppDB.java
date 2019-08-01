package app.datastore;
import java.util.*;

import javax.xml.ws.FaultAction;

import app.dto.*;

public class RSAppDB {
	
	private static Map<Integer,FlatOwner> flatOwnerMap = new HashMap<Integer,FlatOwner>();
	private static Map<Integer, FlatRegistraionDetails> fRegistrationDetailsMap = new HashMap<Integer,FlatRegistraionDetails>();
	static{
		flatOwnerMap.put(1, new FlatOwner(1,"Vaishali","9034390333"));
		flatOwnerMap.put(2, new FlatOwner(2,"Megha","9034390332"));
		flatOwnerMap.put(3, new FlatOwner(3,"Manish","9034390331"));
	}
	
	private RSAppDB() {}
	
	public static Map<Integer, FlatRegistraionDetails> getFlatRegistrationMap() {
		return fRegistrationDetailsMap;
	}

	public static Map<Integer, FlatOwner> getFlatOwnerMap() {
		return flatOwnerMap;
	}
	

}
