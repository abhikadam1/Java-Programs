import java.util.Scanner;
class Numbers
{
	public static void main(String [] args)
	{
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=a;i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
