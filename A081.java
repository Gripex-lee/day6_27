package day6_27;

import java.util.Scanner;

public class A081 {
	public static int countPaths(int mat[][],int m,int n,int cost) {
		if(cost<0) {
			return 0;
		}
		if(m==0 && n==0) {
			return (mat[0][0]-cost==0)?1:0;
		}
		if(m==0) {
			return countPaths(mat,0,n-1,cost-mat[m][n]);
		}
		if(n==0) {
			return countPaths(mat,m-1,0,cost-mat[m][n]);
		}
		return countPaths(mat,m-1,n,cost-mat[m][n])+
				countPaths(mat,m,n-1,cost-mat[m][n]);
	}
	public static void main(String[] args) {
		int[][] mat = {
				{4,7,1,6},
				{5,7,3,9},
				{3,2,1,2},
				{7,1,6,3}
		};
		Scanner br = new Scanner(System.in);
		int cost=br.nextInt();
		System.out.println(countPaths(mat,mat.length-1,mat[0].length-1,cost));
	}
}
