package PracticeProject10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern ptrn=Pattern.compile("Hello21",Pattern.CASE_INSENSITIVE);
		Matcher matcher=ptrn.matcher("Hello21 world");
		boolean matchFound=matcher.find();
		if(matchFound){
			System.out.println("Match found");
		}else{
			System.out.println("Match Not found");
		}


		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );

	}

}
