package app.service;
import app.dto.*;
import java.util.List;
public interface FlatRegistrationService {
	FlatRegistraionDetails registerFlatDetails(FlatRegistraionDetails frDetails);
	List<Integer> getAllRegisterdOwnersId();
	List<FlatRegistraionDetails> getRegisteredFlatDetails();
}
