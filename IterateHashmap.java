package Collections;
//Hashmap iteration using KetSet() Method

import java.util.HashMap;
import java.util.Iterator;
public class IterateHashmap {
	public static void main(String[]args)
	{
       HashMap<Integer,String> hm=new HashMap<Integer,String>();
       hm.put(1, "one");
       hm.put(2, "Two");
       hm.put(3, "Three");
       hm.put(4, "Four");
       
       Iterator<Integer> it=hm.keySet().iterator();
       
       while(it.hasNext())
       {
    	   int key=(int)it.next();
    	   System.out.println("Roll no : "+key+" Numbers in word "+hm.get(key));
       }
       
	}

}
