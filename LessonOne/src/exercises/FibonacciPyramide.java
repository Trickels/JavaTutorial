package exercises;

/**
 * Schauen wir uns nochmal die FibonacciPyramide an. Diesmal in kleine Einzelschritte unterteilt.
 * Ziel die einzelnen Schritte jeweils in eine Methode zu schreiben. So, dass wir am Ende nur noch eine 
 * Methode aufrufen die dann die Pyramide auf die Konsole ausgibt.
 * 
 * Die Grundidee ist dabei uns die Pyramide vorzustellen wie wir sie auf einem karrierten Blatt Papier aufmalen würden.
 * Die Fibonacci Pyramide der Höhe vier sieht so aus:
 * 								1
 * 							   1 1
 *                            1 2 1
 *                           1 3 3 1
 * Dabei steht jede Zahl in einem Kästchen. Da aber die Zahlen nicht direkt untereinander stehen sondern etwas versetzt
 * müssen wir in einer Zeile zwischen den Zahlen immer ein Feld leer lassen.
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
 * Die leeren Kästchen können wir mit 0 füllen.
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
 * Jetzt ergibt sich für uns eine einfacher Algorithmus:
 * 
 * Die erste Zeile mit einer 1 in der Mitte füllen.
 * Alle weiteren Zeilen addieren aus dem vorherigen Array die beiden Zahlen die jeweils schräg über ihm stehen zusammen.
 * 
 * 
 * Ich gebe den Aufruf in der main Methode vor. Deine Aufgabe ist dann die passenden Methoden dazu zu schreiben. Unter der letzten
 * Übung ist der Platz für die Methoden. Da steht ein entsprechender Kommentar
 * Kommentiere die Zeilen wo "TODO" steht ein, wenn du mit der entsprechenden Methode fertig bist.
 */

public class FibonacciPyramide {
	public static void main (String[] args) {
		/*
		 * Übung 1: Erstellen des Feldes
		 * Als erstes müssen wir eine Darstellung dieses Feldes in unserem Programm haben. Dazu nutzen wir doppelte Arrays.
		 * Ein doppeltes Array ist eine Liste deren Inhalt wieder eine Liste ist. 
		 * 
		 * Beispiel: int[][] field = new int[höhe][breite];
		 * 
		 * Das ist dann wie ein Kooridnatensystem auf das du wie folgt zugreifen kannst:
		 * field[y][x] = 1;
		 * 
		 *  Tips: Nutze wieder die "typische" Array schleife for(int x = 0; x < field[y].length; x++). 
		 *  Schreibe als Variablen "x" und "y" wie in einem Koordinatensystem.
		 * 
		 * Die erste Aufgabe lautet daher: Erstelle eine Methode mit dem Namen "createField", 
		 * welche mit einer vorgegebenen Höhe ein Feld erstellt. 
		 * Ermittel anhand der gegebenen Höhe die benötigte Breite.
		 * 
		 */
		
//		int pyramideHeigth = 5; //TODO KOMMENTIER MICH EIN
//		int[][] field = createField(pyramideHeigth); //TODO KOMMENTIER MICH EIN 
		
		
		
		/*
		 * Übung 2: Initialisierung
		 * Das Feld soll zuerst überall mit einer 0 gefüllt werden. Das wird unser Ausgangspunkt.
		 * 
		 * Daher schreibe eine Methode, welche eine mit Zahlen (int) gefülltes Feld (doppeltes Array) überall mit 0len befüllt.
		 * 
		 * Tip: Wenn ich ein Array einer Methode übergebe und diese Methode das Array ändert (in diesem Beispiel mit 0len befüllt)
		 * wird die Änderung für das Array auch außerhalb der Methode sichtbar. Wenn du also der Methode die Variable "field" übergibst,
		 * wird nachdem die Methode mit dem "field" fertig ist, die Änderungen in der Variable "field" sofort sichtbar. Du brauchst also
		 * 
		 * KEIN RÜCKGABEWERT!!!!
		 * 
		 * Wenn du soweit bist frag mich danach. Dann erklär ich das dir:)
		 */
		
//		initializeField(field); //TODO KOMMENTIER MICH EIN
		
		
		
		/*
		 * Übung 3: Malen des Feldes
		 * Als nächstes wollen wir uns zuerst um die Darstellung des Feldes kümmern. Das Feld soll einfach Zeile 
		 * pro Zeile auf die Konsole ausgegeben werden. Der DefaultWert 0 eignet sich aber nicht besonders gut zur 
		 * Darstellung. Daher wollen wir ein "-" anstatt einer 0 ausgeben.
		 * 
		 * Tip: Schreibe Zeichen für Zeichen. Nutze dafür die Methode System.out.print("Text oder Zahl");
		 * Diese fügt kein "Enter" am Ende hinzu.
		 * Schreibe am Ende der Zeile manuell ein "Enter" rein. Das kannst du nur mit sogenannten "EscapeCharacter".
		 * Der EscapeCharacter für Enter ist "\n".Nutze diese Zeile um ein Enter hinzuzufügen:
		 * System.out.print("\n");
		 * 
		 */
		
//		printField(field); //TODO KOMMENTIER MICH EIN. 
		
		
		/*
		 * Übung 3: Erste Zeile füllen
		 * Jetzt kommen wir zum eigentlichen Algorithmus. Als erstes müssen wir in der ersten Zeile genau mittig ein 1
		 * hinschreiben.
		 * 
		 * Schreibe eine Methode, welche eine Zeile nimmt und genau in der Mitte eine 1 reinschreibt. Wir gehen mal davon aus
		 * das die Zeilenlänge ungerade ist....
		 */
		
//		fillFirstRow(field[0]); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		
		/*
		 * Übung 4: Ungerade Zeilen füllen
		 * Wir müssen Zeilen mit einer ungeraden Zeilennummer von Zeilen mit gerader Zeilennumer unterscheiden um
		 * die Verschiebung/Schräge der Pyramide hinzubekommen. Machen wir erstmal die ungeraden Zeilen.
		 * 
		 *  Wir müssen durch die Zeile durchiterieren. Dabei fangen wir bei der ersten ungeraden Zahl an und überspringen die
		 *  "Lücken". Bei jedem Durchlauf müssen wir auf die vorherige Zeile zugreifen und addieren die Zahl die 
		 *  eins vor dem aktuellen Index und die Zahl nach dem aktuellen Index zusammen und schreiben diese Zahl in die aktuelle
		 *  Zeile in den aktuellen Index.
		 *  
		 *   Also aktuellZeile[index] = vorherigeZeile[index-1] + vorherigeZeile[index+1];
		 *   
		 *   Tip: Achte auf ArrayIndexOutOfBoundException. Dann versucht du auf eine Koordinate zuzugreifen die Außerhalb unseres Bereichs liegt
		 *   Überlege welche Zahl Index anehmen darf und garantiere mit einem if das die Regel eingehalten wird.
		 *   
		 *   Um in einer for schleife 2 Schritte zu springen kannst du folgendes Schreiben:
		 *   for (int index = 0; index < row.length; index = index + 2)
		 *   
		 *   
		 *   Schreibe also eine Methode, welche zwei Arrays bekommt. Die aktuelle ungerade Zeile und die vorherige Zeile und die aktuelle Zeile
		 *   anhand der vorherigen Zeile befüllt.
		 *   
		 */
		
//		fillOddRow(field[1], field[0]); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		
		/*
		 * Übung 5: Gerade Zeilen füllen
		 * Das gleiche noch für gerade Zeilen. 
		 * 
		 *   Schreibe also eine Methode, welche zwei Arrays bekommt. Die aktuelle gerade Zeile und die vorherige Zeile und die aktuelle Zeile
		 *   anhand der vorherigen Zeile befüllt.
		 */
		
//		fillEvenRow(field[2], field[1]); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		
		/*
		 * Übung 6: Fülle Feld
		 * Jetzt müssen wir eine Methode schreiben, welche die drei Methoden fillFirstRow, fillOddRow und fillEvenRow
		 * zusammenfasst. Wiederverwendung der Methoden ist AUSDRÜCKLICH erwünscht. KEIN KOPIE PASTE!!!
		 * 
		 * Die Methode bekommt ein mit 0len initialisiertes Feld und iterriert durch die Zeilen. Bei jeder Zeile muss
		 * er entscheiden welche Methode er aufruft.
		 * 
		 * Schreibe eine Methode die als übergabewert eine Feld (doppeltes Array) bekommt. Die Methode soll durch die
		 * Zeilen iterrieren und bei jeder Zeile entscheiden welche Methode sie aus der Übung 3, 4 und 5 benutzten soll.
		 * 
		 * Tip: Nutze den Operator % (Modulo)
		 */
		
//		fillField(field); //TODO KOMMENTIER MICH EIN
//		printField(field); //TODO KOMMENTIER MICH EIN
		
		/*
		 * Übung 7: Zusammenfassen
		 * 
		 * Fast geschafft:
		 * 
		 * Jetzt wollen wir nicht immer die Reihenfolge für die Ausgabe neu schreiben. In 1 Jahr wissen wir das nicht mehr und
		 * auch sonst keiner. Wir wollen eine Methode, welche die einzelnen Schritte durchführt. So dass wir nur noch eine Methode 
		 * aufrufen müssen und dort die gewünschte Höhe eingeben.
		 * 
		 * Schreibe eine Methode, welche die Fibonacci auf die Konsole ausgibt. Nutze dafür alle bis jetzt erstellten Methoden.
		 * (KEIN KOPIE PASTE)
		 * 
		 * Tip: Ja das ist wirklich nicht mehr schwer.
		 */
		
//		printFibonacci(pyramideHeigth); //TODO KOMMENTIER MICH EIN
		
		
		/**
		 * Fleißarbeiten....
		 */
		
		/*
		 * Übung 8: Fasse Übung 4 und Übung 5 zusammen
		 * Die beiden Methoden aus 4 und 5 kann man auch wunderbar zusammenfassen
		 */
		
		
		/*
		 * Übung 9: Falls nicht schon geschehen.... wenn man eine Höhe von über 6 eingibt kommen zweistellige
		 * Zahlen. Die zerschießen dir die Anzeige. Bei höheren Zahlen wird das immer schlimmer.
		 * 
		 * Passe die printField Methode entsprechend an damit das wieder ordentlich aussieht.
		 */
		
//		pyramideHeigth = 10; //TODO KOMMENTIER MICH EIN
//		printFibonacci(pyramideHeigth); //TODO KOMMENTIER MICH EIN
		
		
		
		
	}
	
	
	
	/*
	 * Hier drunter ist dein Platz für Methoden.
	 * 
	 * Ein Beispiel für eine Methode:
	 * public static void methodName(int[][] field) {
	 * 
	 * }
	 * 
	 * public = Sichtbarkitsmodificator
	 * static = markiert die Methode als statisch. Erklärung folgt später
	 * void = An diese Stelle kommt der Rückgabewert. "void" bedeutet das die Methode kein Rückgabe wert hat. Statt
	 * 			"void" könnte auch ein bestimmter Variablentyp zurückgegeben werden. Zum Beispiel int[][]
	 * methodName = der Methodenname. Methodennamen schreibt man klein. Worttrennung wird nur CammelCase gemacht
	 * (int[][]field) = eine kommaseparierte Liste mit den Übergabeparametern. Um die Methode zu benutzen muss dieser Wert übergeben werden
	 * { } = Zwischen den Klammern ist der "Gültigkeitsbereich" für die Methode
	 */

}
