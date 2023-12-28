package PracticeProject3;

class Patient{
	public String name;
	
	public Patient(String name) {
		this.name=name;
	}
}

public class Nurse implements Runnable {

	Patient patient;

	public Nurse(Patient patient) {
		this.patient=patient;
	}

	@Override
	public void run() {
		
		synchronized (patient) {			
		
			System.out.println(Thread.currentThread().getName() + " Attending Patient " +patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
	
			System.out.println(Thread.currentThread().getName() + " Boilng water for injection to "+patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
	
			System.out.println(Thread.currentThread().getName() + " Filing the medicine for injection to "+patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
	
			System.out.println(Thread.currentThread().getName() + " Injecting the Patient "+patient.name);
			try {	Thread.sleep(10);		} catch (InterruptedException e) {		};
		
		}

	}
	
	public static void main(String[] args) {
		
		Patient pat = new Patient("sudheer");
		
		
		Nurse n1= new Nurse(pat);
		Thread nth1= new Thread(n1);
		nth1.setName("Nurse 1:");
		nth1.start();
		
		Nurse n2= new Nurse(pat);
		Thread nth2= new Thread(n2);
		nth2.setName("Nurse 2:");
		nth2.start();
		
	}

}
