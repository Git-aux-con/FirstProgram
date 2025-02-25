import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int b = sc.nextInt();
		int c = b;
		int count = 0;
		int a = 0;
		while(b>0)
		{
			int digit = b%10;
			digit = digit*digit*digit;
			a =  a + digit;		
			count ++;
			b = b/10;	
			while(c == a)
			{
				System.out.println("Given number is an Armstrong Number.");
				break;
			}
		}
			while(c != a)
			{
				System.out.println("Given number is not an Armstrong Number.");
				break;
			}
		
	}

}

