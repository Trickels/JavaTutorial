package exercises;

/**
 * Schauen wir uns nochmal die FibonacciPyramide an. Diesmal in kleine Einzelschritte unterteilt.
 * Ziel die einzelnen Schritte jeweils in eine Methode zu schreiben. So, dass wir am Ende nur noch eine 
 * Methode aufrufen die dann die Pyramide auf die Konsole ausgibt.
 * 
 * Die Grundidee ist dabei uns die Pyramide vorzustellen wie wir sie auf einem karrierten Blatt Papier aufmalen w�rden.
 * Die Fibonacci Pyramide der H�he vier sieht so aus:
 * 								1
 * 							   1 1
 *                            1 2 1
 *                           1 3 3 1
 * Dabei steht jede Zahl in einem K�stchen. Da aber die Zahlen nicht direkt untereinander stehen sondern etwas versetzt
 * m�ssen wir in einer Zeile zwischen den Zahlen immer ein Feld leer lassen.
 * 
 * ---------------
 * | | | |1| | | |
 * ---------------
 * | | |1| |1| | |
 * ---------------
 * | |1| |2| |1| |
 * ---------------
 * |1| |3| |3| |1|
 * ---------------
 * 
 * Die leeren K�stchen k�nnen wir mit 0 f�llen.
 * 
 * ---------------
 * |0|0|0|1|0|0|0|
 * ---------------
 * |0|0|1|0|1|0|0|
 * ---------------
 * |0|1|0|2|0|1|0|
 * ---------------
 * |1|0|3|0|3|0|1|
 * ---------------
 * 
 * Jetzt ergibt sich f�r uns eine einfacher Algorithmus:
 * 
 * Die erste Zeile mit einer 1 in der Mitte f�llen.
 * Alle weiteren Zeilen addieren aus dem vorherigen Array die beiden Zahlen die jeweils schr�g �ber ihm stehen zusammen.
 * 
 * 
 * Ich gebe den Aufruf in der main Methode vor. Deine Aufgabe ist dann die passenden Methoden dazu zu schreiben. Unter der letzten
 * �bung ist der Platz f�r die Methoden. Da steht ein entsprechender Kommentar
 * Kommentiere die Zeilen wo "TODO" steht ein, wenn du mit der entsprechenden Methode fertig bist.
 */

public class FibonacciPyramide {
	public static void main (String[] args) {
		/*
		 * �bung 1: Erstellen des Feldes
		 * Als erstes m�ssen wir eine Darstellung dieses Feldes in unserem Programm haben. Dazu nutzen wir doppelte Arrays.
		 * Ein doppeltes Array ist eine Liste deren Inhalt wieder eine Liste ist. 
		 * 
		 * Beispiel: int[][] field = new int[h�he][breite];
		 * 
		 * Das ist dann wie ein Kooridnatensystem auf das du wie folgt zugreifen kannst:
		 * field[y][x] = 1;
		 * 
		 *  Tips: Nutze wieder die "typische" Array schleife for(int x = 0; x < field[y].length; x++). 
		 *  Schreibe als Variablen "x" und "y" wie in einem Koordinatensystem.
		 * 
		 * Die erste Aufgabe lautet daher: Erstelle eine Methode mit dem Namen "createField", 
		 * welche mit einer vorgegebenen H�he ein Feld erstellt. 
		 * Ermittel anhand der gegebenen H�he die ben�tigte Breite.
		 * 
		 */
		
//		int pyramideHeigth = 5; //TODO KOMMENTIER MICH EIN
//		int[][] field = createField(pyramideHeigth); //TODO KOMMENTIER MICH EIN 
		
		
		
		/*
		 * �bung 2: Initialisierung
		 * Das Feld soll zuerst �berall mit einer 0 gef�llt werden. Das wird unser Ausgangspunkt.
		 * 
		 * Daher schreibe eine Methode, welche eine mit Zahlen (int) gef�lltes Feld (doppeltes Array) �berall mit 0len bef�llt.
		 * 
		 * Tip: Wenn ich ein Array einer Methode �bergebe und diese Methode das Array �ndert (in diesem Beispiel mit 0len bef�llt)
		 * wird die �nderung f�r das Array auch au�erhalb der Methode sichtbar. Wenn du also der Methode die Variable "field" �bergibst,
		 * wird nachdem die Methode mit dem "field" fertig ist, die �nderungen in der Variable "field" sofort sichtbar. Du brauchst also
		 * 
		 * KEIN R�CKGABEWERT!!!!
		 * 
		 * Wenn du soweit bist frag mich danach. Dann erkl�r ich das dir:)
		 */
		
//		initializeField(field); //TODO KOMMENTIER MICH EIN
		
		
		
		/*
		 * �bung 3: Malen des Feldes
		 * Als n�chstes wollen wir uns zuerst um die Darstellung des Feldes k�mmern. Das Feld soll einfach Zeile 
		 * pro Zeile auf die Konsole ausgegeben werden. Der DefaultWert 0 eignet sich aber nicht besonders gut zur 
		 * Darstellung. Daher wollen wir ein "-" anstatt einer 0 ausgeben.
		 * 
		 * Tip: Schreibe Zeichen f�r Zeichen. Nutze daf�r die Methode System.out.print("Text oder Zahl");
		 * Diese f�gt kein "Enter" am Ende hinzu.
		 * Schreibe am Ende der Zeile manuell ein "Enter" rein. Das kannst du nur mit sogenannten "EscapeCharacter".
		 * Der EscapeCharacter f�r Enter ist "\n".Nutze diese Zeile um ein Enter hinzuzuf�gen:
		 * System.out.print("\n");
		 * 
		 */
		
//		printField(field); //TODO KOMMENTIER MICH EIN. 
		
		
		/*
		 * �bung 3: Erste Zeile f�llen
		 * Jetzt kommen wir zum eigentlichen Algorithmus. Als erstes m�ssen wir in der ersten Zeile genau mittig ein 1
		 * hinschreiben.
		 * 
		 * Schreibe eine Methode, welche eine Zeile nimmt und genau in der Mitte eine 1 reinschreibt. Wir gehen mal davon aus
		 * das die Zeilenl�nge ungerade ist....
		 */
		
//		fillFirstRow(field[0]); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		
		/*
		 * �bung 4: Ungerade Zeilen f�llen
		 * Wir m�ssen Zeilen mit einer ungeraden Zeilennummer von Zeilen mit gerader Zeilennumer unterscheiden um
		 * die Verschiebung/Schr�ge der Pyramide hinzubekommen. Machen wir erstmal die ungeraden Zeilen.
		 * 
		 *  Wir m�ssen durch die Zeile durchiterieren. Dabei fangen wir bei der ersten ungeraden Zahl an und �berspringen die
		 *  "L�cken". Bei jedem Durchlauf m�ssen wir auf die vorherige Zeile zugreifen und addieren die Zahl die 
		 *  eins vor dem aktuellen Index und die Zahl nach dem aktuellen Index zusammen und schreiben diese Zahl in die aktuelle
		 *  Zeile in den aktuellen Index.
		 *  
		 *   Also aktuellZeile[index] = vorherigeZeile[index-1] + vorherigeZeile[index+1];
		 *   
		 *   Tip: Achte auf ArrayIndexOutOfBoundException. Dann versucht du auf eine Koordinate zuzugreifen die Au�erhalb unseres Bereichs liegt
		 *   �berlege welche Zahl Index anehmen darf und garantiere mit einem if das die Regel eingehalten wird.
		 *   
		 *   Um in einer for schleife 2 Schritte zu springen kannst du folgendes Schreiben:
		 *   for (int index = 0; index < row.length; index = index + 2)
		 *   
		 *   
		 *   Schreibe also eine Methode, welche zwei Arrays bekommt. Die aktuelle ungerade Zeile und die vorherige Zeile und die aktuelle Zeile
		 *   anhand der vorherigen Zeile bef�llt.
		 *   
		 */
		
//		fillOddRow(field[1], field[0]); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		
		/*
		 * �bung 5: Gerade Zeilen f�llen
		 * Das gleiche noch f�r gerade Zeilen. 
		 * 
		 *   Schreibe also eine Methode, welche zwei Arrays bekommt. Die aktuelle gerade Zeile und die vorherige Zeile und die aktuelle Zeile
		 *   anhand der vorherigen Zeile bef�llt.
		 */
		
//		fillEvenRow(field[2], field[1]); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		
		/*
		 * �bung 6: F�lle Feld
		 * Jetzt m�ssen wir eine Methode schreiben, welche die drei Methoden fillFirstRow, fillOddRow und fillEvenRow
		 * zusammenfasst. Wiederverwendung der Methoden ist AUSDR�CKLICH erw�nscht. KEIN KOPIE PASTE!!!
		 * 
		 * Die Methode bekommt ein mit 0len initialisiertes Feld und iterriert durch die Zeilen. Bei jeder Zeile muss
		 * er entscheiden welche Methode er aufruft.
		 * 
		 * Schreibe eine Methode die als �bergabewert eine Feld (doppeltes Array) bekommt. Die Methode soll durch die
		 * Zeilen iterrieren und bei jeder Zeile entscheiden welche Methode sie aus der �bung 3, 4 und 5 benutzten soll.
		 * 
		 * Tip: Nutze den Operator % (Modulo)
		 */
		
//		fillField(field); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		/*
		 * �bung 7: Zusammenfassen
		 * 
		 * Fast geschafft:
		 * 
		 * Jetzt wollen wir nicht immer die Reihenfolge f�r die Ausgabe neu schreiben. In 1 Jahr wissen wir das nicht mehr und
		 * auch sonst keiner. Wir wollen eine Methode, welche die einzelnen Schritte durchf�hrt. So dass wir nur noch eine Methode 
		 * aufrufen m�ssen und dort die gew�nschte H�he eingeben.
		 * 
		 * Schreibe eine Methode, welche die Fibonacci auf die Konsole ausgibt. Nutze daf�r alle bis jetzt erstellten Methoden.
		 * (KEIN KOPIE PASTE)
		 * 
		 * Tip: Ja das ist wirklich nicht mehr schwer.
		 */
		
//		printFibonacci(pyramideHeigth); //TODO KOMMENTIER MICH EIN
		
		
		/**
		 * Flei�arbeiten....
		 */
		
		/*
		 * �bung 8: Fasse �bung 4 und �bung 5 zusammen
		 * Die beiden Methoden aus 4 und 5 kann man auch wunderbar zusammenfassen
		 */
		
		
		/*
		 * �bung 9: Falls nicht schon geschehen.... wenn man eine H�he von �ber 6 eingibt kommen zweistellige
		 * Zahlen. Die zerschie�en dir die Anzeige. Bei h�heren Zahlen wird das immer schlimmer.
		 * 
		 * Passe die printField Methode entsprechend an damit das wieder ordentlich aussieht.
		 */
		
//		pyramideHeigth = 10; //TODO KOMMENTIER MICH EIN
//		printFibonacci(pyramideHeigth); //TODO KOMMENTIER MICH EIN
		
		
		
		
	}
	
	
	
	/*
	 * Hier drunter ist dein Platz f�r Methoden.
	 * 
	 * Ein Beispiel f�r eine Methode:
	 * public static void methodName(int[][] field) {
	 * 
	 * }
	 * 
	 * public = Sichtbarkitsmodificator
	 * static = markiert die Methode als statisch. Erkl�rung folgt sp�ter
	 * void = An diese Stelle kommt der R�ckgabewert. "void" bedeutet das die Methode kein R�ckgabe wert hat. Statt
	 * 			"void" k�nnte auch ein bestimmter Variablentyp zur�ckgegeben werden. Zum Beispiel int[][]
	 * methodName = der Methodenname. Methodennamen schreibt man klein. Worttrennung wird nur CammelCase gemacht
	 * (int[][]field) = eine kommaseparierte Liste mit den �bergabeparametern. Um die Methode zu benutzen muss dieser Wert �bergeben werden
	 * { } = Zwischen den Klammern ist der "G�ltigkeitsbereich" f�r die Methode
	 */

}
