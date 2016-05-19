import java.util.ArrayList;
import java.util.List;import java.util.regex.PatternSyntaxException;

public class Doctor {
	List<Patient> p = new ArrayList<Patient>();
	public Object makesHouseCalls() {
		return false;
	}
	public Object performsSurgery() {
		return false;
	}
	public void assignPatient(Patient patient) throws DoctorFullException {
		if (p.size() >= 3) {
			
			throw new DoctorFullException("Could not add patient " + patient + ", doctor has max patients");
		}else {
			p.add(patient);
		}
	
		
	}
	public List<Patient> getPatients() {
		return p;
	}
	public void doMedicine() {
		for (Patient i:p) {
			i.checkPulse();
		}
		
	}

}
