package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class traversing_list {

	public static void main(String[] args) {
		
		
		HashMap<String, Double> headerValueMap = new HashMap<>();
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("tiger");
		animals.add("cat");
		animals.add("dog");

		for (int i=0; i <animals.size(); i++) {
			System.out.println(animals.get(i));
		}

		for (String animal :animals) {
			System.out.println(animal);
		}
		
		
		ArrayList<Vehicles> vehicles = new ArrayList<Vehicles>();
		vehicles.add(new Vehicles("Ford","Blue",12000, false));
		Vehicles camery = new Vehicles("Camery", "Gray",10000,true);
		vehicles.add(camery);
		
		for (Vehicles car : vehicles) {
			System.out.println(car);
		}
		
	}

}
