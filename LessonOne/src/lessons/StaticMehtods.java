package lessons;

public class StaticMehtods {
	//Platz f�r globale Variablen (statisch und nicht statische)
	private static String hallo = "Hallo";
	
	//Platz f�r Methoden
	
	public static void main(String[] args) {
		System.out.println(helloWorld(" Dominik"));
	}
	
	public static String helloWorld(String name) {
		return hallo + name;
	}
}
