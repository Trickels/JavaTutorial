package solutions;

public class SolutionFibonacciPyramide {
	
	public static void main(String[] args) {
		int[][] field = createField(10);
		initializeField(field);
		fillField(field);
		printField(field);
		
		printFibonacci(10);
	}
	
	public static int[][] createField(int h) {
		int[][] field = new int[h][h*2 + 1];
		return field;
	}
	
	public static void initializeField(int[][] field ) {
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field[y].length; x++) {
				field[y][x] = 0;				
			}
		}
	}
	
	public static void printField(int[][] field) {
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field[y].length; x++) {
				if (field[y][x] == 0) {
					System.out.print("-");
				} else {
					System.out.print(field[y][x]);
				}				
			}
			System.out.print("\n");
		}
	}
	
	public static void fillField(int[][] field) {
		for (int i = 0; i < field.length; i++) {
			if (i == 0) {
				fillFirstRow(field[i]);
			} else if (i%2 == 0) {
				fillEvenRow(field[i], field[i-1]);				
			} else if (i%2 == 1) {
				fillOddRow(field[i], field[i-1]);
			}
			
		}
	}
	
	public static void fillFirstRow(int[] row) {
		row[(row.length-1)/2] = 1;
	}
	
	public static void fillOddRow(int[] row, int[] previousRow) {
		for (int i = 1; i < row.length; i++) {
			if (i+1 != previousRow.length) {
				row[i] = previousRow[i-1] + previousRow[i+1];					
				
			}
		}
	}
	
	public static void fillEvenRow(int[] row, int[] previousRow) {
		for (int i = 0; i < row.length; i++) {
			if (i != 0 && i != row.length-1) {
				row[i] = previousRow[i-1] + previousRow[i+1];					
			}
		}
	}
	
	public static void printFibonacci(int h) {
		int[][] field = createField(h);
		initializeField(field);
		fillField(field);
		printField(field);
	}
	
}
