import java.util.Scanner;

public class matrixMul {
	public static void main(String args[])
	{
		int m,n;
		Scanner inp = new Scanner(System.in);

		//Scanning 1st matrix
		System.out.println("Give the order of 1st matrix...and then it's elements");
		m = inp.nextInt();
		n = inp.nextInt();
		int a[][] = new int[m][n];
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[0].length; j++)
				a[i][j] = inp.nextInt();
		
		System.out.println("Give the order of 2nd matrix...and then it's elements");
		m = inp.nextInt();
		n = inp.nextInt();
		int b[][] = new int[m][n];
		
		//Checking if they can be multiplied...
		if(a[0].length!=b.length)
		{
			System.out.println("The matrices cannot be multiplied.");
			System.exit(0);
		}
		
		for(int i=0; i<b.length; i++)
			for(int j=0; j<b[0].length; j++)
				b[i][j] = inp.nextInt();
		
		inp.close();
		
		//Initialising the product matrix...
		int c[][] = new int[a.length][b[0].length];
		
		//Multiplying the two matrices...
		for (int i=0; i<a.length; i++)
			for(int j=0; j<b[0].length; j++)
				for(int k=0; k<b.length; k++)
				{
					c[i][j] += a[i][k]*b[k][j];
				}
		
		//Printing the product matrix...
		System.out.println("The product matrix is:");
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[0].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

