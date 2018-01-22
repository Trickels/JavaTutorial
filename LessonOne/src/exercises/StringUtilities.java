package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUtilities {

	public StringUtilities() {
		
	}
	
	public String deleteWhitespace(String text) {
		String result = text.replaceAll(" ", "");
		return result;
	}
	
	public void mytest() {
		String a = "a";
	}
	
	public String readConsole() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String result = null;
			while (true) {
				if (result != null) {
					break;
				}					
				System.out.println("Wait for input");
				result = reader.readLine();
			}
			
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
