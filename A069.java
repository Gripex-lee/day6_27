package day6_27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A069 {
	public static void main(String[] args) {
		Map map=new HashMap();  
        map.put(1, 2);    
        map.put(1, 3);    
        map.put(2, 3);     
        int x=1;
        Iterator iterator = map.keySet().iterator();                
        while (iterator.hasNext()) {  
         int key = (int) iterator.next(); 
        	 System.out.print(map.get(1)+" "); 
        }
	}
}
