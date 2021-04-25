package strings;

public class StrngsPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		String b = "there";
		
		//String is a call, thus it contains its own methods
		String subA1 = a.substring(0); //ello
		String subA2 = a.substring(0,2); //he
		
		//String.equals
		if(a.equals("hello")) {
			System.out.println("print hello");
		}
		// string not equal to 
		if(b.equalsIgnoreCase("There"))
		//String.
			System.out.println("print there");
		
		System.out.println(a.charAt(4));
		
	}

}
