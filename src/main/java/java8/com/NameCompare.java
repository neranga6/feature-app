package java8.com;

import java.util.Comparator;

 class NameCompare implements Comparator<Students> {
	
	@Override
    public int compare(Students m1, Students m2)
    {
        return m1.getName().compareTo(m2.getName());
    }

	
}
