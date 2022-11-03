package Collections;
import java.util.HashMap;
import java.util.Map;
//Hashmap Iteration over keys and getting values
public class HashmapIterationoverkey {
	public static void main(String[]args)
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Maha", "Prabu");
		map.put("Ranjith", "Raj");
		map.put("Albert","sham");
		map.put("Tailor", "Swift");
		
		for(String name: map.keySet())
		{
			String lastname=map.get(name);
			System.out.println("Key :"+name+", Value :"+lastname);
		}
	}

}
