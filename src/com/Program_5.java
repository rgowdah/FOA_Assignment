package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_5 {
	public static int minimumTotal(List<List<Integer>> triangle) {
		//if size of triangle is zero then return zero
		if(triangle.size() == 0) return 0;
		/*Bottom Up Dynamic Programming Approach
		 * i varies from the row before last row to first row
		 * j varies zeroth column to i*/
		for (int i=triangle.size()-2; i>=0; i--) {
			for (int j=0; j<=i; j++) {
				List<Integer> nRow = triangle.get(i+1);
				//dynamic programming formula
				int sum =triangle.get(i).get(j)+Math.min(nRow.get(j), nRow.get(j+1));
				triangle.get(i).set(j, sum);
			}
		}
		return triangle.get(0).get(0);
	}
	public static void main(String[] args) {
		List<List<Integer>> triangle=new ArrayList<List<Integer>>(Arrays.asList(Arrays.asList(-1),Arrays.asList(2,3),Arrays.asList(1,-1,-3),Arrays.asList(4,1,8,3)));
		System.out.println(triangle.toString());
		System.out.println(minimumTotal(triangle));
	}

}
