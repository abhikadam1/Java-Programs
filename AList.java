import java.util.ArrayList;

class AList
{
	public static void main(String [] args)
	{
		ArrayList<String> aList = new ArrayList<> ();
		aList.add(" Java");
		aList.add("Programming");
		aList.add("Basics ");
		
		//System.out.println("ArrayList is : "+aList);
		System.out.println("ArrayList is : "+aList.get(1));
	}

}