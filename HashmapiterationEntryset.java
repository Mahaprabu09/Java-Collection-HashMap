package Collections;
import java.util.HashMap;
import java.util.Map;
//      iterate Map        Using Map.entry<K,V>method
public class HashmapiterationEntryset {
	public static void main(String[]args)
	{
		Map<String,Float> map=new HashMap<String,Float>();
		map.put("one", 10.101f);
		map.put("Two", 20.102f);
		map.put("Three", 20.103f);
		map.put("Four", 30.104f);
		//using map.entrySet() for iteration
		for(Map.Entry<String,Float> entry : map.entrySet())
		{
			//returns keys and values respectively  
			System.out.println("Number in words :"+entry.getKey()+", Float values :"+entry.getValue());
		}	
	}
}
