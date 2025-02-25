import java.util.Scanner;
class Factorial
{
		public static void main(String[] args)
		{     

			Scanner obj =new Scanner(System.in);
			int Fac = 1;
			System.out.print("Enter the Number : ");
			int i = obj.nextInt();
			for(int a = 1;a <= i;a++)
			{
				Fac = Fac*a;
					
			}
				System.out.println("The Factorial of given number is "+Fac);

			System.out.println("=================================================================================");

			int sum = 0;
			System.out.print("Enter the Number : ");
			int j = obj.nextInt();
			for(int b = 1;b <= j;b++)
			{
				sum = sum + b;
					
			}
				System.out.print("The Sum of given number is "+sum);

		}
}