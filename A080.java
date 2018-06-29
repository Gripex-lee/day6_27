package day6_27;

import java.util.*;

class Gair{
	private int start, finish;
	
	public Gair(int start, int finish) {
	   this.start = start;
	   this.finish = finish;
	}
	
	public int getFinish() {
	   return finish;
	}
	
	public int getStart() {
	   return start;
	}
	
	@Override
	public String toString() {
	   return "(" + getStart() + " " + getFinish() + ")";
	}
};

public class A080{
	public static void main(String[] args){
	   List<Gair> activities = Arrays.asList(new Gair(1, 4), new Gair(3, 5),
	           new Gair(0, 6), new Gair(5, 7), new Gair(3, 8),
	           new Gair(5, 9), new Gair(6, 10), new Gair(8, 11),
	           new Gair(8, 12), new Gair(2, 13), new Gair(12, 14));
	
	   // 根据其完成时间对活动进行排序
	   Collections.sort(activities, (a, b) -> a.getFinish() - b.getFinish());
	
	   Set<Integer> res = selectActivity(activities);
	
	   for (Integer i: res) {
	       System.out.print(activities.get(i)+" ");
	   }
	}

	private static Set<Integer> selectActivity(List<Gair> activities) {
			   // k跟踪最后选择的活动的索引
			   int k = 0;
			
			   // 设置为存储选定的活动索引
			   Set<Integer> out = new HashSet<>();
			
			   // 选择0作为第一个活动
			   out.add(0);
			
			 //从第二个元素开始迭代
			 //矢量到它的最后一个元素
			   for (int i = 1; i < activities.size(); i++)
			   {
				 //如果第i个活动的开始时间大于或等于
				 //到最后一次选定活动的结束时间
				 //可以包含在活动列表中
			       if (activities.get(i).getStart() >= activities.get(k).getFinish())
			       {
			           out.add(i);
			           k = i;    //将我更新为最后选择的活动
			       }
			   }
			
			   return out;
			}
}
