
public class Pyramid {
public static void main(String[] args) {
	
	int n=5;
    // number of spaces
    int k = 2*n - 2;

    // outer loop to handle number of rows
    //  n in this case
    for (int i=n; i>1; i--)
    {

        // inner loop to handle number spaces
        // values changing acc. to requirement
        for (int j=1; j<k; j++)
        {
            // printing spaces
            System.out.print(" ");
        }

        // decrementing k after each loop
        k = k - 1;

        //  inner loop to handle number of columns
        //  values changing acc. to outer loop
        for (int j=1; j<=i; j++ )
        {
            // printing stars
            System.out.print(j+" ");
        }

        // ending line after each row
        System.out.println();
}
}
}