package module_3;

public class Encapsulation {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println(age);
	}

	public static void main(String[] args) {

		Encapsulation ec = new Encapsulation();

		ec.setName("ashok");
		ec.setAge(27);

	}

}
