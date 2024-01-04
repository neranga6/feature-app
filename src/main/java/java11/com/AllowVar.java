package java11.com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllowVar {
	
	
		public static void main(String[] args)
		{
			IntStream.of(1, 2, 3, 5, 6, 7)
				.filter((var i) -> i % 2 == 0)
				.forEach(System.out::println);
			
			Stream myStr = Stream.of(1,22,23,4,5);
			
			
			myStr.filter((var i)->  i.equals(22))
			.forEach(System.out::println);
						
			var abc = "helloWorld";
			
			
			
		}
	}



