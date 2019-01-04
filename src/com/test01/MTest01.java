package com.test01;

public class MTest01 {
	int x;
	void change (MTest01 rs2) {
		System.out.println("Befor Change x = "+ rs2.x);
		rs2.x = 2000;
		System.out.println("\nAfter Change x = "+rs2.x);
	}
	public static void main(String[] args) {
		MTest01 rs = new MTest01();
		rs.x = 10;
		System.out.println("Main Befor Calling x = " + rs.x);
		rs.change(rs);
		System.out.println("Main After Calling x = "+rs.x);
	}
}
