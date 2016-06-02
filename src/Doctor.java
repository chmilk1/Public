import java.util.ArrayList;
import java.util.List;import java.util.regex.PatternSyntaxException;

public class Doctor {
	Hospital aHospital = new Hospital();
	boolean evil = false;
	List<Patient> p = new ArrayList<Patient>();
	public Doctor(String string) {
		if (string.equals("666")) {
			//popular memes
			evil = true;
		}
	}
	public Doctor() {
		
	}
	public Doctor(String string, Hospital aHospital) {
		this(string);
		this.aHospital = aHospital;
	}
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
			if (evil) {
				i.kill();
				 
			}
		}
		
		
	}
	public boolean isEvil() {
		// TODO Auto-generated method stub
		return evil;
	}
	public void joinTheDarkSide() {
		evil = true;
		
	}
	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return aHospital;
	}

}
