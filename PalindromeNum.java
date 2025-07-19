class PalindromeNum
{
	static void Pal()
	{
		int n=78587, rev=0,rem=0;
		int a=n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		System.out.println(rev);
		
		if(a==rev)
			System.out.println("Yes Matched ");
		else
			System.out.println(" Not Match");
	}
	public static void main(String[] args)
	{
		PalindromeNum p =new PalindromeNum();
		p.Pal();
	}
	
	
}