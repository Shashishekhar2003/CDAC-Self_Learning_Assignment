package com.demo;

public class Q04Implement {
	public static void main(String[] args) {

		// 1.String  safe but slow
		String str = "Shashi";
		str.concat("Shashi");
		System.out.println(str); // String is  cannot change

		str = str.concat("Shekhar");
		System.out.println("Updated String: " + str);

		// 2.StringBuffer safe + mutable
		StringBuffer sb = new StringBuffer("shashi");
		sb.append("shashi");
		System.out.println("StringBuffer: " + sb);
		
		//3.StringBuilder   fast +mutable
		StringBuilder sb2 = new StringBuilder("Shashi");
		sb2.append("shashi");
		System.out.println("StringBuilder: "+sb2);

	}
}
