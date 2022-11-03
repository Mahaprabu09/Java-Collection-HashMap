package Collections;
import java.util.HashMap;
import java.util.Iterator;

//Collection views methods using hashmap
//Iteration using hashmap KeySet and Values 
public class Iteartionkeysetandvalues {
	public static void main(String[]args)
	{
		HashMap<String,String> kv=new HashMap<String,String>();
		kv.put("Salem","steel");
		kv.put("Chennai", "industry");
		kv.put("Ooty","Cold climate");
		kv.put("Coimbatore", "black thunder");
		
		Iterator<String>it=kv.keySet().iterator();
		 //using keyset() method for iteration over keySet  
		for(String District:kv.keySet())
			System.out.println(" District : "+District);	
		 //using values() for iteration over keys 
		for(String famous:kv.values())
			System.out.println(" Famous for :"+famous);
				
	}

}
