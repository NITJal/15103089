import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for(i=2; i<=n; i++)
		{
			for(j=2; j<i; j++)
			{
				//Checking if the number is divisible by any other number...
				if(i%j == 0)
					break;
			}
			if(j == i)
				System.out.println(j);
		}
	}
}
