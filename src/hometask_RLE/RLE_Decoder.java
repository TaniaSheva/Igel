package hometask_RLE;


public class RLE_Decoder {
	
	public static String decode (String text) {
	    String decodedString = "";

	    for (int i = 0; i < text.length(); i++) {
	    	String currentSym = text.substring(i, i+1);
	    	try {
	    		
	    		int currentNum = Integer.parseInt(currentSym);
	    			for (int j = 0; j < currentNum; j++) {
	    				decodedString = decodedString.concat(text.substring(i+1, i+2));
	    			}
	    			i++;
		    	
	    	}
	    	
	    	catch (NumberFormatException exp) {
	    		decodedString = decodedString.concat(currentSym);
	    	
	    	}
	    	
	    }
	    
		return decodedString;
	}
	public static boolean isStringValid (String string){
		
		String lastSym = string.substring(string.length()-1, string.length());
    	try {
    		Integer.parseInt(lastSym);
    		
    		if (string.length() == 1) {
    			System.out.println("Please, add a char to the number");
    		}
    		
    		else {
    			System.out.println("Number cannot be positioned in the end of the string");
    		}
    		
    		return false;
    	}
    	
    	catch (NumberFormatException exp) {
    	
    	}	
		boolean isNum = false;
		 for (int i = 0; i < string.length(); i++) {
		    	String currentSym = string.substring(i, i+1);
		    	try {
		    		Integer.parseInt(currentSym);
		    		if (isNum) {
		    			System.out.println("Two numbers cannot be placed inline");
		    			return false;
		    		}
		    		else { 
		    			isNum = true;			    			
		    		}			    		
		    	}			 
		    	
		    	catch (NumberFormatException exp) {
		    		isNum = false;
		    	}	
		   }
		return true;
	}
}
