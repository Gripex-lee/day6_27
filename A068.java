package day6_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class A068 {
	public static void main(String[] args) {
        Map<Integer,List<String>> levelmap=new HashMap<Integer,List<String>>();
        List<String> putlist=new ArrayList<>();
        putlist.add("多个值1");
        putlist.add("多个值2");
        putlist.add("多个值3");
         
       for (int i=0;i<5;i++){
           levelmap.put(i, putlist);
       }
        
       //打印levemap的值
       for (Entry<Integer, List<String>> in: levelmap.entrySet()){
           System.out.println("key===  "+in.getKey()+"     values=  "+in.getValue());
       }
   }
}
