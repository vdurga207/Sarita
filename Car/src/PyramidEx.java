
public class PyramidEx {

	public static void main(String[] args) {
	int n=5;	
	        // number of spaces
	        int i, j, k=2*n-2;
	        // outer loop to handle number of rows
	        //  n in this case
	        for(i=0; i<n; i++)
	        {
	 
	            // inner loop to handle number spaces
	            // values changing acc. to requirement
	            for(j=0; j<k; j++)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	             
	            // decrementing k after each loop
	            k = k - 2;
	             
	           
	            for(j=0; j<=i; j++)
	            {
	              
	                System.out.print(i+" ");
	            }
	             
	           
	            System.out.println();
	        }

	}

}
