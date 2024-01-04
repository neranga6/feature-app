package java8.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSort {

	/**
	 * @param args
	 */
	
public static void main(String[] args) {
		
		
		ArrayList<Students> studentList =  new ArrayList();
		
		
		studentList.add(new Students("John",44));
		studentList.add(new Students("Ravi",55));
		studentList.add(new Students("Raj",43));
		studentList.add(new Students("Mohomad",34));
		studentList.add(new Students("Neranga",42));
		
		
		System.out.println("StudentNames"+ "____________________________");
		
		Collections.sort(studentList);
		
		for (Students student : studentList) {
			
			System.out.print(student.getName()+ ",");
		}
		
		StudentCompare studentCompare = new StudentCompare();
		
		System.out.println("StudentAges"+ "____________________________");

		Collections.sort(studentList,studentCompare);
		
		
        for (Students student : studentList) {
			
			System.out.print(student.getName()+ ",");
		}
        
         
        NameCompare nameCompare = new NameCompare();
        
        Collections.sort(studentList,nameCompare);
		
        System.out.println("StudentNames Comapare to"+ "____________________________");
		
        for (Students student : studentList) {
			
			System.out.print(student.getName()+ ",");
		}
		
		
		
	}

}
