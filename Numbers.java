import java.util.Scanner;
class Numbers
{
	public static void main(String [] args)
	{
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=1;i<a; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.println(j);
			}
		}
	}
}
