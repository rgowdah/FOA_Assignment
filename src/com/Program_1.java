package com;

import java.util.ArrayList;

public class Program_1 {	
	public static String countAndSay(int n){
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1); 	
		int count=0;
		String result="";
		if(n<=0) return "";
		for (int i = 2; i <= n; i++) {
			ArrayList<Integer> arrayList1=new ArrayList<Integer>(arrayList);
			int temp=arrayList1.get(0);
			arrayList.clear();
			count=1;
			for (int j = 1; j <arrayList1.size(); j++) {
				if(temp == arrayList1.get(j))
					count++;
				else {
					arrayList.add(count);
					arrayList.add(temp);
					temp=arrayList1.get(j);
					count=1;
				}
			}
			arrayList.add(count);
			arrayList.add(temp);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			result +=arrayList.get(i).toString();
		}
		return result;		
	}
	public static void main(String[] args) {		
		System.out.println(countAndSay(4));
	}
}