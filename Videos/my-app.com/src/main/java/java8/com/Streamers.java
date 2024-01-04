package java8.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamers {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ravi", "Raj", "Neranga", "Mohomad");

		List<String> results = names.stream().filter(r -> ((String) r).startsWith("R")).collect(Collectors.toList());

		for (int i = 0; i < results.size(); i++) {

			System.out.println(results.get(i));

		}
		
		results.forEach(s -> System.out.println(s));
				
	    Stream<String> res = names.stream().sorted();
	    
	    res.forEach(s -> System.out.println(s));
	    
	  
		
		
	}

}
