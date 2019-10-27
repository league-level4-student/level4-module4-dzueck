package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	
	public void addDoctor(Doctor d){
		doctors.add(d);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void addPatient(Patient p){
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() throws DoctorWorkedTooHardExeption {
		int onDoctor = 0;
		for(int i = 0; i < patients.size(); i++) {
			onDoctor = i / 3;
			doctors.get(onDoctor).assignPatient(patients.get(i));
		}
	}

}
