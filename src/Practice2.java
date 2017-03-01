
public class Practice2 {

	public static void main(String[] args) {
		int number = 1;
		for (int i = 1; i <= 5; i++) {			
			for (int j=1; j<6; j++) // j<N+1, N=5
            {		
				
                  if (i == j) {
                         System.out.print("*	");
                  }
                  
                  else if (i + j == 6) { // i + j = N+1, N = 5
                      System.out.print("*	");
                  }
                  
                  else {
                	     
                         System.out.printf("%02d",number);
                         System.out.print("	");
                  }
                  number++;
				}
				System.out.println();
		}

	}
}
