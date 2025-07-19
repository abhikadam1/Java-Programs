//Abhishek Subhash Kadam
//Roll no-56 Div-A
//Exp no-15

import java.util.*;

class Expt15
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		        hm.put("Abhi",161);
		        hm.put("Mrunal",144);
		        hm.put("Sahil",154);
		        hm.put("Aniket",169);
		        hm.put("Ajay",164);
				
		    System.out.println("\nTHIS IS HASHMAP METHOD");
			System.out.println(hm);
		    System.out.println("key :" + hm.keySet());
			System.out.println("values :" + hm.values());
		
			System.out.println("HashMap set is :" + hm.entrySet());
			
			System.out.println("\n\nTHIS IS TREEMAP METHOD");
			TreeMap<String,Integer> tm=new TreeMap<String,Integer>(hm);
			System.out.println(tm);
			
			System.out.println("TreeMap set is :" + tm.entrySet());
			
				Set s=tm.entrySet();
				Iterator itr=s.iterator();
				
				while(itr.hasNext()){
				      Map.Entry m=(Map.Entry)itr.next();
					  System.out.println("key: "+ m.getKey() + " value: "+ m.getValue());
				}
    }
}