
public class Zoo {;
	public static void main(String[] args) {
//		Animal monkey = new Animal(5,"male", 40);
//		monkey.basicInfo();
//		monkey.eat();

//		Bird bird1 = new Bird(5,"F",10);
//		bird1.basicInfo();
//		bird1.eat();

		
//		Sparrow sparraw1 = new Sparrow(1,"M",5);
	
		
		Animal sparrow2 = new Sparrow(2,"F",4);
		//only higher level funciton could be called
		
		Animal fish1 = new Fish(2,"f",6);
		
		moveAnimal(fish1);
		moveAnimal(sparrow2);
		
		
		Flyable bird2 = new Sparrow(3,"M",6);

	};
	
	
//applying Polymorphism 
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
