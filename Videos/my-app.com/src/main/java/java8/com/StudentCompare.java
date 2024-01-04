package java8.com;

import java.util.Comparator;

class StudentCompare implements Comparator<Students> {
		

@Override
public int compare(Students m1, Students m2) {
	
	 if (m1.getAge() < m2.getAge())
		 
         return -1;
	 
     if (m1.getAge() > m2.getAge())
         return 1;
     
     else
    	 
         return 0;
	
		}





	}

