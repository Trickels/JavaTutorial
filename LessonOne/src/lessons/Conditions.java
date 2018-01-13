package lessons;

public class Conditions {
	public static void main(String[] args) {
		int i = 1;
		String hello = "Hallo ";
		if (i == 1) {
			System.out.println(hello + "Dominik");
		} else {
			System.out.println(hello + "World");
		}
		
		String userName = "Dominik";
		if (userName == "Dominik") { // TOTALY WRONG!!!!!
			System.out.println(hello + userName);
		} else if (userName.equals("Dominik")) { //THIS IS CORRECT!!!!
			System.out.println(hello + userName);
		}
		
		
		switch (i) {
		case 0:
			System.out.println(hello + "Dominik");
			break;
		case 1:
			System.out.println(hello + "Merlin");
			break;
		default:
			System.out.println(hello + "World");
			break;	
		}
	}
}
