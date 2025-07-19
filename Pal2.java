import java.util.Scanner;
class Pal2
{
	static boolean pal(int num)
	{
		int rev=0, rem=0, a=num;
		while(a!=0)
		{
			rem=a%10;
			rev*=rev+rem;
			num/=10;
		}
		if(rev==num)
		{
			System.out.println("True\n");
			return true;
		}
		
		else
		{
			System.out.println("Falase\n");
			return false;
		}
	}
	
	public static void main(String args [])
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		pal(a);
	}
	
}