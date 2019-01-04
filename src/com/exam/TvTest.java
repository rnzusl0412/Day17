package com.exam;

public class TvTest {
	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, " LCD TV");
		tvArray[2] = new Tv("CINEMA", 200000, "3D TV");

		for (int i = 0; i < tvArray.length; i++) {
			if (tvArray[i].getDescription().equals("3D TV")) {
				tvArray[i].setDescription("LCD TV");
			}
			System.out.println(tvArray[i].toString());
		}
		// 3D TV일 경우에 LCD TV로 바꿔라

	}
}
