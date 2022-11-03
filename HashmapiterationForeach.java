package Collections;
import java.util.HashMap;
import java.util.Map;
//HashMap iteration Using forEach method
public class HashmapiterationForeach {
	public static void main(String[]args)
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Samsung a10s ", "18000");
		map.put("Poco m2 ","12000");
		map.put("Realme x3", "8000");
		//forEach method for Iteration of the key and value of the HashMap
		map.forEach((key,value)-> System.out.println("Mobile name :"+key+"Price :"+value));
		
	}

}
