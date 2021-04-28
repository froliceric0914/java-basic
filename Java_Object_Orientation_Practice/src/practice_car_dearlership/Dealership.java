package practice_car_dearlership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1 = new Customer();
		cus1.setName("Eric");
		cus1.setAddress("69 Lynn Williams");
		cus1.setCashOnHand(20000);
		
		Vehicle v1 = new Vehicle("Ford", 10000,false);
		Vehicle v2 = new Vehicle("Lexis", 20000,true);
		Vehicle v3 = new Vehicle("Benz", 50000,false);

		
		Employee e1 = new Employee("Kevin");
		
		handleCustomer(cus1, v1, e1);
		handleCustomer(cus1, v2, e1);
		handleCustomer(cus1, v3, e1);


		
	}
	
	public static void handleCustomer(Customer cust, Vehicle v, Employee e) {
		if(v.finance == true) {
			System.out.println("Congrats! " + cust.getName() + ". Our employee " + e.name + "will help you finance this " + v.brand);
		}else if(cust.getCashOnHand() >= v.price) {
			System.out.println("Congrats!! " + cust.getName() + ", you can get this " + v.brand);
		} else {
			double difference = v.price - cust.getCashOnHand();
			System.out.println("Sorry, you will need extra " + difference + " to get this " + v.brand);
			
		}
	}
	/*
	 * 
	 * handleCustomer()
	 * if(fiance == true){
	 * 	runCreditHistory
	 * }else{ Vehicle.getPrice() <=cus1.getCashOnHand()
	 * processTransaction(Customer cust, Vehicle)
	 * else:
	 * 		 tell customer to get more money
	 */

}
