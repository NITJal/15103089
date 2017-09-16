import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		StringBuffer p = new StringBuffer(s).reverse();//Reversing the string...
		if(s.equals(p.toString()))
			System.out.println("The given string is a palindrome.");
		else
			System.out.println("The given string is not a palindrome.");
	}
}
