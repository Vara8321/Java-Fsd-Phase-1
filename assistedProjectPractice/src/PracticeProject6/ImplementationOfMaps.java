package PracticeProject6;

import java.util.Map;
import java.util.TreeMap;

import java.util.ArrayList;

import java.util.List;

class Patients{
	int id;
	String name;
	int age;
	
	public Patients(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class ImplementationOfMaps  {
	public static void main(String[] args) {
		List<Patients> patientList1=new ArrayList<Patients>();
		
		Patients d0 = new Patients(101,"monish",35);
		Patients d1 = new Patients(102,"rakesh", 55);
		Patients d2 = new Patients(103,"Tanveer", 33);
		Patients d3 = new Patients(104,"prasad", 42);
		Patients d4 = new Patients(105,"vara", 66);
		
		patientList1.add(d0);
		patientList1.add(d1);
		patientList1.add(d2);
		patientList1.add(d3);
		patientList1.add(d4);
		
		Map<String, Patients> mapNameWithPatient = new TreeMap<String, Patients>();		
		mapNameWithPatient.put(d1.name, d1);
		mapNameWithPatient.put(d2.name, d2);
		mapNameWithPatient.put(d3.name, d3);
		mapNameWithPatient.put(d4.name, d4);
		mapNameWithPatient.put(d0.name, d0);
		
		// search for a doctor with a particular name
		
		String nameOfPatientToSearch = "Jimmy";
		Patients searchedPat = mapNameWithPatient.get(nameOfPatientToSearch);
		if(searchedPat!=null)
			System.out.printf("Doctor with name %s found \n", nameOfPatientToSearch);
		else
			System.out.printf("Doctor with name %s not found \n", nameOfPatientToSearch);
	}
}
