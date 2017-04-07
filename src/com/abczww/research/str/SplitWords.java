package com.abczww.research.str;

public class SplitWords {
	
	private SplitWords(){
		String demo = "hi,hello world!";
		String[] arr = demo.split("\\b");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args){
		new SplitWords();
	}

}
