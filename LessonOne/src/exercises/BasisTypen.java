package exercises;

public class BasisTypen {

	public static void main(String[] args) {
		//�bung 1
		boolean myBoolean = false;
		myBoolean = myBoolean || true;
		System.out.println(myBoolean);
		
		//�bung 2
		int i = 0;
		i = i + 4;
		System.out.println(i);
		
		//�bung 3
		int j = 2147483647;
		j = j + 1;
		System.out.println(j);
		
		//�bung 4
		double a = 1/100000000;
		double b = a*100000000;
		System.out.println(b==1);

		//�bung 5
		boolean myBoolean2 = false;
		System.out.println(!myBoolean2);
		
		//�bung 6
		int k = 42;
		System.out.println(k%4);
		
		
		//�bung 7
		int z = 22;
		int z2 = 0;
		System.out.println(z/z2);
	}

}
