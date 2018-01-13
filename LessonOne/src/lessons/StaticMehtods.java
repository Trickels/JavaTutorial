package lessons;

public class StaticMehtods {
	//Platz für globale Variablen (statisch und nicht statische)
	private static String hallo = "Hallo";
	
	//Platz für Methoden
	
	public static void main(String[] args) {
		System.out.println(helloWorld(" Dominik"));
	}
	
	public static String helloWorld(String name) {
		return hallo + name;
	}
}
