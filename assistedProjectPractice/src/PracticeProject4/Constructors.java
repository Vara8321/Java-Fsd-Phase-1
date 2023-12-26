package PracticeProject4;

class Employee1{
	int id;
	String name;
	
	//Constructor with two parameters
	public Employee1(int id1,String name1) {
		this.id=id1;
		this.name=name1;
	}
	
	//Constructor with one parameter
	public Employee1(int id) {
		this.id=id;
	}
	
	void display() {
		System.out.println(id+" "+name);
		}

}

public class Constructors {
	public static void main(String[] args) {
		
		//Employee1 emp=new Employee1(); when we created constructor, the default one is removed
		
		Employee1 emp1=new Employee1(102,"abc");
		emp1.display();
		
		Employee1 emp2=new Employee1(101);
		emp2.display(); //employee name gives null
		
		
	}

}
