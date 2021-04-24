
public class Zoo {;
	public static void main(String[] args) {
		Animal monkey = new Animal(5,"male", 40);
		monkey.basicInfo();
		monkey.eat();
		
		Bird bird = new Bird(5,"F",10);
		bird.basicInfo();
		bird.eat();
		
		Sparrow sparraw1 = new Sparrow(1,"M",5);
		sparraw1.basicInfo();
		sparraw1.fly();
		
	};
	
}
