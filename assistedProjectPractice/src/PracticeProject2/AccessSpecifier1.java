package PracticeProject2;

class defAccessSpecifier{ 
  void display() 
     { 
         System.out.println("This is defalut access specifier"); 
     } 
}

class PriAccessSpecifier 
{ 
   private void display() 
    { 
        System.out.println("This is private access specifier"); 
    } 
} 

class ProAccessSpecifier {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

class PubAccessSpecifier {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}



public class AccessSpecifier1 {

	public static void main(String[] args) {
		
		
		defAccessSpecifier obj1 = new defAccessSpecifier(); 		  
        obj1.display();
        
        PubAccessSpecifier obj2 = new PubAccessSpecifier(); 		  
        obj2.display();
        
        
       // Private methods cannot be accessed in another Class
       // PriAccessSpecifier obj3 = new PriAccessSpecifier(); 		  
       // obj3.display();
        
        ProAccessSpecifier obj4 = new ProAccessSpecifier(); 		  
        obj4.display();



	}
}

