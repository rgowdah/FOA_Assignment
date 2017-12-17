package com;

public class Program_4 {	
	public static int numDecodings(String s) {
		//checking if given message is empty or starts with 0 if so returns 0
		if(s.length()==0 || s.charAt(0)=='0') return 0;
		//checking if given message is of length 1, if so it returns 1
		if(s.length()==1) return 1;
		int count=1,temp=1,n1=0;
		for (int i = 2; i <=s.length(); i++) {
			n1=0;
			//if char at i-1 is not zero then update n1 with count else proceed with n1=0
			if(s.charAt(i-1)!='0') n1=count;
			int n=Integer.parseInt(s.substring(i-2, i));
			if(n>=10 && n<=26) n1+=temp;
			temp=count;
			count=n1;
		}		
		return count;    	
	}
	public static void main(String[] args) {			
		System.out.println(numDecodings("2200"));
		
	}
}
