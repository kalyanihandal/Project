package com.pattern;

public class P {

	public static void main(String[] args) {
		String s="i am an proud indian";
		String s1="aeiou";
	for(int i=0;i<s.length();i++){
		for(int j=0;j<s1.length();j++){
			if(s.charAt(i)==s1.charAt(j)){
				System.out.println("vowel "+s.charAt(i)+"at position"+i);
			}
		}
	}
	}

}
