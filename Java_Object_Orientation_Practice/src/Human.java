
public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//constructor method always as the same as the class
	public Human(String name, int heightInInches, String eyeColor, int age ) {
		super(); //point to the current class
		this.name = name;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My eye color is " + eyeColor);
		System.out.println("My heightInInches is " + heightInInches);
	}
	
	
}
