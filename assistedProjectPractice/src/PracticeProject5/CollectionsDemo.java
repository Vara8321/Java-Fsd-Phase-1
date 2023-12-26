package PracticeProject5;

import java.util.*;

class Doctor{
	int id;
	String name;
	int age;
	
	public Doctor(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		//using ArrayList
		List<Doctor> doctorList1=new ArrayList<Doctor>();
		
		Doctor d0 = new Doctor(101,"monish",35);
		Doctor d1 = new Doctor(102,"rakesh", 55);
		Doctor d2 = new Doctor(103,"Tanveer", 33);
		Doctor d3 = new Doctor(104,"prasad", 42);
		Doctor d4 = new Doctor(105,"vara", 66);
		
		doctorList1.add(d0);
		doctorList1.add(d1);
		doctorList1.add(d2);
		doctorList1.add(d3);
		doctorList1.add(d4);
		
		for (Doctor d : doctorList1) {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		}
		
		// Sort the doctors by age
		doctorList1.sort((doc1, doc2) -> (int) (doc1.age - doc2.age));
		System.out.println("\n doctorList1 Sorted by Age");
		for (Doctor d : doctorList1) {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		}
		
		// Sort the doctors by name
		doctorList1.sort((doc1, doc2) -> doc1.name.compareTo(doc2.name));
		System.out.println("\n doctorList1 Sorted by name");
		for (Doctor d : doctorList1) {
			System.out.printf("Doctor name %s age %s \n", d.name, d.age);
		}
		
		// using set, HashSet
		System.out.println("\n\n SET DEMO");
		Set<Doctor> doctorSet = new HashSet<Doctor>();
		
		doctorSet.add(d0);
		doctorSet.add(d1);
		doctorSet.add(d2);
		doctorSet.add(d3);
		doctorSet.add(d4);
		
		System.out.printf("There are %s doctors in the doctorSet \n", doctorSet.size());
		
		doctorSet.add(d2);//No duplicates allowed in set
		
		System.out.printf("There are %s doctors in the doctorSet \n", doctorSet.size());
		
		//using map, TreeMap
		System.out.println("\n ** Map demo **");
		Map<String, Doctor> mapNameWithDoctor = new TreeMap<String, Doctor>();
		mapNameWithDoctor.put(d1.name, d1);
		mapNameWithDoctor.put(d2.name, d2);
		mapNameWithDoctor.put(d3.name, d3);
		mapNameWithDoctor.put(d4.name, d4);
		mapNameWithDoctor.put(d0.name, d0);
		
		// search for a doctor with a particular name
		
		String nameOfDoctorToSearch = "Jimmy";
		Doctor searchedDoc = mapNameWithDoctor.get(nameOfDoctorToSearch);
		if(searchedDoc!=null)
			System.out.printf("Doctor with name %s found \n", nameOfDoctorToSearch);
		else
			System.out.printf("Doctor with name %s not found \n", nameOfDoctorToSearch);
	}
}
