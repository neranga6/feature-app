package java8.com;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaArrayMap {

	public static void main(String[] args) {

		String ab = "hello";
		String cd = "hello";
		
		String tx = new String ("hello");
		

		boolean ef;
		boolean sd;

		ef = ab == tx;

		System.out.println(ef);

		sd = ab.equals(tx);

		System.out.println(sd);
		
	
		HashMap<Integer,String>  mymap = new HashMap();
		
		mymap.put(1,"Texas");
		mymap.put(2,"NewYork");
		mymap.put(3,"Nebraska");
		mymap.put(4 ,"Iowa");
		
		
	    String abd = mymap.get(1);
		
		if(abd.equals("Texas")) {
			
		 System.out.println("Hello");
			
		}
		
		ArrayList<String> myList = new ArrayList();
		
		myList.add("texas");
		myList.add("Iowa");
		myList.add("Nebraska");
		myList.add("NewYork");
		
		for(int i=0; i< myList.size();i++) {
			
			System.out.print(myList.get(i)+",");	

		}
		
			

	}

}
