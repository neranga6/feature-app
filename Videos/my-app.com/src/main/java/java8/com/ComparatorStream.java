package java8.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class ComparatorStream {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList();

		myList.add("Neranga");
		myList.add("Raj");
		myList.add("Tom");
		myList.add("Ravi");
		myList.add("Anne");

		Stream<String> res = myList.stream().sorted(Comparator.reverseOrder());

		res.forEach(s -> System.out.println(s));

		Comparator<String> nameComparator = new Comparator<String> () {

			public int compare(String o1, String o2) {
				
				int ab = o1.length();
				int cd = o2.length();

				if (ab < cd)

					return -1;

				if (ab > cd)
					return 1;

				else

					return 0;

			}
			
		};
		
		
		Stream<String> len = ((Stream<String>) myList.stream()).sorted(nameComparator);

		len.forEach(s -> System.out.println(s + ","));
	}

}
