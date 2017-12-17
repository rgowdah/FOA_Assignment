package com;

import java.util.Scanner;

public class Program_3 {
	public static int lengthOfLastWord(String s) { 
        //removing double quotes and space using trim function
		s=s.replace("\"", "").trim();
        //if length of the string is less than one return 0
		if(s.length()<1) return 0;
		else if(s.length()==1) return s.length();
		for (int i = s.length()-1; i>0; i--) {			
			if(s.charAt(i)==' ') return s.length()-i-1;
		}
		return s.length();
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int length=lengthOfLastWord(s);
		System.out.println(length);
		sc.close();
	}
}

/*ALternate methods
 * Method 2
System.out.println(s.trim().substring(s.lastIndexOf(' ')+1).length());

		String[] str=s.split(" ");
		System.out.println(str[str.length-1].length());
 */
