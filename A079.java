package day6_27;

import java.util.Scanner;

public class A079 {
	private static void printCombination(char pattern[],int i) {
		if(i==pattern.length) {
			System.out.println(pattern);
			return;
		}
		if(pattern[i]=='?') {
			for(char ch='0';ch<='1';ch++) {
				pattern[i]=ch;
				printCombination(pattern,i+1);
				pattern[i] = '?';
			}
			return;
		}
		printCombination(pattern, i+1);
	}
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		char[] pattern = br.nextLine().toCharArray();
		printCombination(pattern, 0);
	}
}
