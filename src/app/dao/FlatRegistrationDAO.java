package app.dao;
import app.dto.FlatRegistraionDetails;
import java.util.List;

public interface FlatRegistrationDAO {
	FlatRegistraionDetails registerFlat(FlatRegistraionDetails registraitionDetails);
	List<Integer> getAllOwnerIds();
	List<FlatRegistraionDetails> getRegistrationList();

}
