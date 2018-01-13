package lessons;

public class Loops {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}	
		
		System.out.println("----------------- 1 ------------------");
		
		for (int i : intArray) {
			System.out.println(i);
		}
		
		System.out.println("----------------- 2 ------------------");
		
		int i = 0;
		while(i < intArray.length) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("----------------- 3 ------------------");

		int j = 0;
		while(true) {
			j = j + 1; // = j++
			System.out.println(j);
			if (j == 10) {
				break;
			}
		}
		
		System.out.println("----------------- 4 ------------------");
		
		for (int k = 0; k < intArray.length; k++) {
			if (k == 2) {
				continue;
			}
			System.out.println(intArray[k]);
		}
	}
}
