package exerciseBook;

public class exerciseBook1 {

	private String name;
	private int age;

	public exerciseBook1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "연습장1 [name=" + name + ", age=" + age + "]";
	}


}
