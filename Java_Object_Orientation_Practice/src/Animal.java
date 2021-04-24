
public abstract class Animal {
	int age;
	String gender;
	int weightInLbs;
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void basicInfo() {
		System.out.println("Its age is " + age);
		System.out.println("It is a " + gender + "and weight in " + weightInLbs);
	}
	
	public void eat() {
		System.out.println("Eat...");
	}
	
	public abstract void move();
	
}
