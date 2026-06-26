//Create String Demo class and perform different string manipulation
//methods.



package com.demo;


public class Q03StringDemo {
	public static void main(String[] args) {
		String str1 = "Shashi";
		String str2 = "Shekhar";


		System.out.println("Length: " + str1.length());

	
		System.out.println("\ncharAt index 1:" + str1.charAt(0));


		String reasult = str1.concat(str1).concat(str2);
		System.out.println("\nconcat" + reasult);
	
		System.out.println("Equal: "+str1.equals(str2));
		System.out.println("Uppercase: "+str1.toUpperCase());
	
		System.out.println("Lowercase: "+str1.toLowerCase());

		System.out.println("contails 'ell':" +str1.contains("ell"));
		

		System.out.println("Substring: (1,4): "+str1.substring(1,4));
		
		System.out.println("Replace: "+str1.replace('l', 'x'));
	
      System.out.println("Index of 'l': " + str1.indexOf('1'));

      System.out.println("Last Index of 'l': " + str1.lastIndexOf('l'));
	}
}
