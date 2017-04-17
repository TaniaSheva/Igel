package hometask_RLE;

public class RLE_Encoder {
	public static String encode(String text) {
	    String encodedString = "";
	    int count = 1;

	    for (int i = 1; i < text.length(); i++) {
	        if (text.charAt(i) == text.charAt(i - 1) && count < 9) {
	        	count++;
	        }
	            	        
	        else if (count == 1 && i > 2 && text.charAt(i - 2) == text.charAt(i - 1)) {
	        	encodedString = encodedString.concat(Integer.toString(count))
	                    .concat(Character.toString(text.charAt(i-1)));
	        }
	        
	        else if (count == 1 && text.charAt(i) != text.charAt(i - 1)) {
	        	encodedString = encodedString.concat(Character.toString(text.charAt(i-1)));
	        }

	        else { 
	        	encodedString = encodedString.concat(Integer.toString(count))
	                    .concat(Character.toString(text.charAt(i-1)));
	            count = 1;
	        }
	    }
	    int j = text.length();
	    if (j == 1) {
	    	encodedString = text;
	    }
	    else if (count == 1 && j > 2 && text.charAt(j - 2) == text.charAt(j - 1)) {
        	encodedString = encodedString.concat(Integer.toString(count))
                    .concat(Character.toString(text.charAt(j - 1)));
        }
        
        else if (count == 1 && text.charAt(j - 1) != text.charAt(j - 2)) {
        	encodedString = encodedString.concat(Character.toString(text.charAt(j - 1)));
        }

        else { 
        	encodedString = encodedString.concat(Integer.toString(count))
                    .concat(Character.toString(text.charAt(j - 1)));
        }
	    return encodedString;
	}
	
	public static boolean isStringValid (String string) {
		
		for (int i = 0; i < string.length(); i++) {
	    	String currentSym = string.substring(i, i+1);
	    	try {
	    		Integer.parseInt(currentSym);
	    		System.out.println("Only [a-z] symbols are allowed");
	    		return false;
	    	}
	    	
	    	catch (NumberFormatException exp) {

	    	}	
	   }
		return true;

	}
	
}
