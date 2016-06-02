
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospital {
	//TODO remove TODOs
	Date daaaaaaaaaaaaaaaaaaaaaaate = new Date();
	List<Doctor> Doctors = new ArrayList<Doctor>();
	List<Patient> consumers = new ArrayList<Patient>();
	List<Zombie> rip = new ArrayList<Zombie>();
	int pV = 0;
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

	public void assignPatientsToDoctors() {
		for(Doctor omg: Doctors){
			for (int i = 0; i < 3; i++) {
				try {
					omg.assignPatient(getNextP());
				} catch (NoneLeft e) {
					break;
				} catch (Exception e){
					System.out.println("Riparoni Peproni");
				}
			}
		}
		
	}
	public Patient getNextP() throws NoneLeft{
		pV++;
		if (consumers.get(pV-1) == null) {
			throw new NoneLeft("No Patients left");
		}
		return consumers.get(pV-1);
		
	}

	public void add(Doctor d) {
		Doctors.add(d);
		
	}
	public void add(Patient p) {
		consumers.add(p);
		
	}

	public void makeDoctorsWork() {
		for (Doctor d:Doctors) {
			d.doMedicine();
		}
		for (Doctor d:Doctors) {
			for (Patient p:d.getPatients()) {
				if(p.live==false){
					rip.add(new Zombie(daaaaaaaaaaaaaaaaaaaaaaate.toString()));
					if (consumers.size()>1) {
						consumers.remove(0);
					}
					
				}
			}
		}
		
	}

	public List<Zombie> getZombies() {

		return rip;
	}


}
