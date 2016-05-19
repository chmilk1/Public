import java.util.ArrayList;
import java.util.List;

public class Hospital {
	//TODO remove TODOs
	List<Doctor> Doctors = new ArrayList<Doctor>();
	List<Patient> consumers = new ArrayList<Patient>();
	public List<Doctor> getDoctors() {
		return Doctors;
	}

	public void addDoctor(Doctor j) {
	Doctors.add(j);	
	}

	public void addPatient(Patient patient) {
		consumers.add(patient);
	}

	public List<Patient> getPatients() {
		return consumers;
	}


}
