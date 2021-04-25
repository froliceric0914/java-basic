package strings;

public class LoopPractice {

	public static void main(String[] args) {
//		 int count = 0;
//		 
//		 while(count <= 100) {
//			 System.out.println("now :" + count);
//			 count = count +1;
//			 
//			 if(count == 30) {
//				 break;
//			 }
//		 }
		String str = "AVDAILHDLHALKDJLKLAJL";
		printCategories(str);

	}
	
	public static void printCategories(String string) {
//		int i = 0;
//		while(true) {
//			
//			int found = string.in
//		}
//		
		for (int i = 0; i < string.length(); i ++){
			System.out.println(string.charAt(i));
		}
	}

}
