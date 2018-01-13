package exercises;

public class StaticMethods {
	
	private static int[] numbers1 = {1, 2, 5, 10, 100, 0, -2, -3, 0};
	private static int[] numbers2 = {3 ,5, 7, 15, 3  , 2,  1, -5, 0};
	
	public static void main(String[] args) {
		
		//Beispiel
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(addWithYourself(numbers1[i]));
		}
	
		
		/*
		 * Übung1: Schreibe eine Methode die jeweils zwei Zahlen miteinander multipliziert. Teste es mit den beiden Arrays.
		 * Multipliziere jeweils die Zahlen welche die gleiche Indexzahl haben und gebe das Ergebnis auf die Konsole aus
		 * Also: 1 * 3 ; 2 * 5 usw.
		 */
		
		
		
		
		
		/*
		 * Übung2: Schreibe eine Methode welche ein int-Array in umgekehrter Reihenfolge wieder zurückgibt und gib das Ergebnis
		 *  auf die Konsole aus
		 */
		
		
		
		/*
		 * Übung3: Schreibe eine Methode, welche dir die Fibonacci Pyramide mit einer angegebenen Höhe leserlich auf die Konsole ausgibt.
		 * Optional kannst du die Ausgabe noch verschönern.
		 * 
		 * Fibonacci Pyramide der Höhe 4:		1
		 * 									   1 1
		 *                                    1 2 1
		 *                                   1 3 3 1
		 */
		
		
	}
	
	//Beispiel
	public static int addWithYourself(int i) {
		int result = i + i;
		return result;
	}
}
