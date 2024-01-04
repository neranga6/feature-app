package java8.com;

@FunctionalInterface
public interface Interface1 {
	
    abstract String method1(String str);
	
	private String log(String str){
		str = "hello";
		
		System.out.println("Printing "+str);
		return str;
	}
	
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
	

}
