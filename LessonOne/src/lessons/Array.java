package lessons;

public class Array {

	public static void main(String[] args) {
		int[] integerList = new int[5];
		
		integerList[0] = 1;
		integerList[1] = 2;
		integerList[2] = 3;
		integerList[3] = 4;
		integerList[4] = 5;

		//Außerhalb des Bereichs
//		integerList[5] = 6;
		
		int[][] field = new int[5][5];
		field[0][0] = 1;
		
		int[] integerList2 = {1,2,3,4,5};
		
		System.out.println(integerList2.length);
		
	}

}
