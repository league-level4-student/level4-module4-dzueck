package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<>();
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) throws DoctorWorkedTooHardExeption {
		if(patients.size() == 3) {
			throw new DoctorWorkedTooHardExeption("Death Is Inevitable");
		}
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	public void doMedicine() {
		for(Patient p: patients) {
			p.checkPulse();
		}
	}

}
