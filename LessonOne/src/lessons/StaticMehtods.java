package lessons;

public class StaticMehtods {
	//Platz für globale Variablen (statisch und nicht statische)
	private static String hallo = "Hallo";
	
	
	//Platz für Methoden
	
	public static void main(String[] args) {
		String halloDominik = helloWorld("Dominik");
		System.out.println(halloDominik);
		halloMerlin("Merlin");
		return;
		
	}
	
	public static String helloWorld(String name) {
		return hallo + name;
	}
	
	public static void halloMerlin(String name) {
		System.out.println("Hallo " + name);
	}
}
