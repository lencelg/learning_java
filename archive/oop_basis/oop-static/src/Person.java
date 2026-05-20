
public class Person {
	public static int count = 0;
	String name;

	public Person(String name) {
		this.name = name;
		count++;
	}

	public static int getCount(){
		return count;
	}

}
