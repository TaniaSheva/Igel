package hometask_RLE;

import java.util.Scanner;

public class RLE_Run {
	private static Scanner input;
	public static void main(String[] args) {
		
		System.out.print("Please type the string you want to encode:");
		System.out.println();
		
		input = new Scanner(System.in);
		String encodeText = input.next();
		
		if (RLE_Encoder.isStringValid(encodeText)) {
			System.out.println(RLE_Encoder.encode(encodeText));
		}
		 
		 
		 System.out.print("Please type the string you want to decode:");
		 
		 System.out.println();
		 input = new Scanner(System.in);
			
		 String decodeText = input.next();
		 if (RLE_Decoder.isStringValid(decodeText)){
				
			System.out.println(RLE_Decoder.decode(decodeText));
		 }
			 
		//test();
	}
		
	public static void test() {
	    checkString("hheeeeeeeeeellooo");
	    checkString("h");
	    checkString("world");
	    checkString("httooo");
	    checkString("htoo");
	    checkString("hrrrrrrrrrrrrrrrrrrrrrrrrrrrro");
	    checkString("abcde");
	    checkString("Aab");
	    //checkString("9");
	}

	public static void checkString (String string) {
		
	    String encoded = RLE_Encoder.encode(string);
	    String decoded = RLE_Decoder.decode(encoded);
	    
	    if (!decoded.equals(string)) {
	    	System.out.println("WHAT! Decoded:" + decoded + "!=String:" + string );
	    }
	    else {
	    	System.out.println("OK:" + string);
	    }
	}
}
