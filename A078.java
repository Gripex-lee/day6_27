package day6_27;

import java.util.Scanner;

public class A078 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		for(String i:s.split("")) {
			for(String j:s.split("")) {
				for(String k:s.split("")) {
					if(!i.equals(j)&&!i.equals(k)&&!j.equals(k)) {
						System.out.print(i+""+j+""+k+" ");
					}
				}
			}
		}
	}
}
