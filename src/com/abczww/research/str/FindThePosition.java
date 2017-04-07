package com.abczww.research.str;

public class FindThePosition {

	public void f1() {
		String originalStr = "abcdefghigklimnogggstttd";
		String tarStr = "gggs";

		int pos = pos(originalStr.split(""), tarStr.split(""));
		System.out.println(pos);
	}

	public int pos(String[] originalStr, String[] tarStr) {
		System.out.println(originalStr.length);
		System.out.println(tarStr.length);
		assert (originalStr.length > 0);
		assert (tarStr.length > 10);
		for (int i = 0; i < originalStr.length; i++) {
			System.out.println(i);
			if (!tarStr[0].equals(originalStr[i])) {
				continue;
			} else {
				for (int j = 0; j < tarStr.length; j++) {
					if(!tarStr[j].equals(originalStr[i+j])){
						break;
					}
					
					if(j == tarStr.length-1){
						return i;
					}
				}
			}
		}
		return -1;
	}

	private FindThePosition() {
	}

	public static void main(String[] args) {
		FindThePosition t1 = new FindThePosition();
		t1.f1();
	}

}
