package java11.com;

import java.util.stream.Collectors;

public class JavaStringMethods {

	public static void main(String[] args) {
		
		String myString1 = "HelloWord\nhi";
		String myString2 = "";
		
		
		System.out.println(myString1.isBlank());
		
		System.out.println(myString2.isBlank());
		
		System.out.println(myString1.lines().collect(Collectors.toList()));
		
		
		/*
		 * removed whitespace start and end  
		 */
		
        String str = " JD "; 
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");
        
        /*
         * Remove whitespace from start.
         */
        
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");
        
        /*
         * Removes whitespace from end.
         */
        
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
		
        
        /*
         * Repeat same string requiredtimes that needs
         */
        
        String str1 = "=".repeat(2);
        System.out.println(str1);
		
		
		
	}

}
