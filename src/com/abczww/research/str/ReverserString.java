package com.abczww.research.str;

public class ReverserString {
	
	private ReverserString(){
		
	}
	
	private String reverse(String str){
		return new StringBuilder(str).reverse().toString();
	}
	
	public static void main(String[] args){
		ReverserString rs = new ReverserString();
		String test = "This is a test, just a test";
		String result = rs.reverse(test);
		System.out.println(result);
	}

}
