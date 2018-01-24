package exercises;

public class StaticMethods {
	
	private static int[] numbers1 = {1, 2, 5, 10, 100, 0, -2, -3, 0};
	private static int[] numbers2 = {3 ,5, 7, 15, 3  , 2,  1, -5, 0};
	
	public static void main (String[] args) {
        int[] newarray = new int[numbers1.length];
        int zwischenspeicher = 0;
        int b = newarray.length;
        for (int a = 0; a < numbers1.length; a++) {
            zwischenspeicher = numbers1[a];
            newarray[b-1] = zwischenspeicher;
            b--;

            }
            System.out.println(newarray[b]);
        }

	
//	public static void main(String[] args) {
//		
//		//Beispiel
//		for (int i = 0; i < numbers1.length; i++) {
//			System.out.println(addWithYourself(numbers1[i]));
//		}
//		
//		
//	
//		
//		/*
//		 * Übung1: Schreibe eine Methode die jeweils zwei Zahlen miteinander multipliziert. Nutze nur + und -. Teste es mit den beiden Arrays.
//		 * Multipliziere jeweils die Zahlen welche die gleiche Indexzahl haben und gebe das Ergebnis auf die Konsole aus
//		 * Also: 1 * 3 ; 2 * 5 usw.
//		 */
//		
//		
//		
//		
//		
//		/*
//		 * Übung2: Schreibe eine Methode welche ein int-Array in umgekehrter Reihenfolge wieder zurückgibt und gib das Ergebnis
//		 *  auf die Konsole aus
//		 */
//
//		
//		
//		/*
//		 * Übung3: Schreibe eine Methode, welche dir die Fibonacci Pyramide mit einer angegebenen Höhe leserlich auf die Konsole ausgibt.
//		 * Optional kannst du die Ausgabe noch verschönern.
//		 * 
//		 * Fibonacci Pyramide der Höhe 4:		1
//		 * 									   1 1
//		 *                                    1 2 1
//		 *                                   1 3 3 1
//		 */
//		
//		
//		
//		
//		
//	}
//	
//	//Beispiel
//	public static int addWithYourself(int i) {
//		int result = i + i;
//		return result;
//	}
}
