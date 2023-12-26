package PracticeProject8;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="string function program";
		String s2="string function";
		
		System.out.println("single string functions");
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.codePointBefore(4));
		System.out.println(s1.codePointCount(0, 5));
		
		System.out.println("string compare functions");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println("string concat functions");
		
		System.out.println(s1.concat(s2));
		
		System.out.println("String contains functions");
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains("s"));
		
		System.out.println("String content Equals functions");
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals("string"));
		System.out.println(s1.equals(s2));
		
		System.out.println("String ends with ");
		System.out.println(s1.endsWith("gram"));
		
		System.out.println("Finding hashcode of string");
		System.out.println(s1.hashCode());
		
		//String Builder Functions
		System.out.println("\n Sring Builder Functions");
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder("welcome");
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb1.append("hello how are you"));
		System.out.println(sb2.append(sb1));
		System.out.println(sb1.reverse());
		System.out.println(sb1.insert(2, "her"));
		System.out.println(sb2.delete(0, 7));
		
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
		String str = "Hello"; 
		        
		// conversion from String object to StringBuffer 
		StringBuffer sbr = new StringBuffer(str); 
		sbr.reverse(); 
		System.out.println("String to StringBuffer");
		System.out.println(sbr); 
		          
		// conversion from String object to StringBuilder 
		StringBuilder sbl = new StringBuilder(str); 
		sbl.append("world"); 
		System.out.println("String to StringBuilder");
		System.out.println(sbl);              

	}

}
