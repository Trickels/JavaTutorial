package solutions;

public class SolutionStaticMethods {

	private static int[] numbers1 = { 1, 2, 5, 10, 100, 0, -2, -3, 0 };
	private static int[] numbers2 = { 3, 5, 7, 15, 3, 	2,  1, -5, 0 };

	public static void main(String[] args) {

		// Beispiel
		System.out.println("Beispiel:");
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(addWithYourself(numbers1[i]));
		}
		System.out.println("_____________________________________");
		
		System.out.println("Übung 1:");
		// Übung1:
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(multi(numbers1[i], numbers2[i]));
		}
		System.out.println("_____________________________________");
		
		//Übung2:
		System.out.println("Übung 2:");
		int[] result = revert(numbers1);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	/*
	 * Übung1: Schreibe eine Methode die jeweils zwei Zahlen miteinander
	 * multipliziert. Nutze nur + und -. Teste es mit den beiden Arrays.
	 * Multipliziere jeweils die Zahlen welche die gleiche Indexzahl haben und gebe
	 * das Ergebnis auf die Konsole aus Also: 1 * 3 ; 2 * 5 usw.
	 */
	  
	  public static int multi(int a, int b) {
		  int result = 0;
		  if (a < 0 ) {
			  for (int i = 0; i > a; i--) {
				  result = result - b;
			  }
		  } else {
			  for (int i = 0; i < a; i++) {
				  
				  result = result + b;
			  }			  
			  
		  }
		  return result;
	  }

	 /* Übung2: Schreibe eine Methode welche ein int-Array in umgekehrter
	 * Reihenfolge wieder zurückgibt und gib das Ergebnis auf die Konsole aus
	 */
	  
	  public static int[] revert(int[] array) {
		  int[] result = new int[array.length];
		  
		  for (int i = 0; i < array.length; i++) {
			  result[result.length-1-i] = array[i];
		  }
		  
		  return result;
	  }

	// Beispiel

	public static int addWithYourself(int i) {
		int result = i + i;
		return result;
	}

}
