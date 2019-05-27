package test;

import club.lylgjiang.common.util.MD5Util;

public class Test01 {

	public static void main(String[] args) {
		String str = "123";
		
		System.out.println(MD5Util.digest(str));
	}
	
}
