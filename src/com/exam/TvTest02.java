package com.exam;

public class TvTest02 {
	public static void main(String[] args) {
		Tv tvArray[] = { new Tv("INFINIA", 1500000, "LED TV"), new Tv("XCANVAS", 1000000, " LCD TV"),
				new Tv("CINEMA", 200000, "3D TV") };

		for (Tv r: tvArray) {
			//���� Tv�� �̸��� CINEMA ��� ������ 40000000���� ��������
			if (r.getName().equals("CINEMA")) {
				r.setPrice(4000000);
			}
				
			
			System.out.println(r);
			
			
		}
	}
}
