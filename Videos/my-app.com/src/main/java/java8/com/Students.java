package java8.com;

 class Students implements Comparable<Students> {

	private String name;
	private int age;

	// constructor
	public Students(String name, int age) {

		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Students s) {
		
	 return	this.age - s.age;
	}

	

}
