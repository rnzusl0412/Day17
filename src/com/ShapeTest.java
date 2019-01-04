package com;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];	//abstract는 객체생성 불가
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		
		System.out.println("기본정보");
		for (int i = 0; i <=5; i++) {
			if (shape[i].getClass()==new Triangle().getClass()){
				String name = "Triangle";
				double d = shape[i].getArea();
				System.out.printf("%-10s  %5.1f  %5s \n",name,d,shape[i].getColor());
			} else {
				String name = "Rectangle";
				double d = shape[i].getArea();
				System.out.printf("%-10s  %5.1f  %5s \n",name,d,shape[i].getColor());
			}
		}
		System.out.println();
		
		System.out.println("사이즈를 변경 후 정보");
		String stype = null;
		
		for (Shape s : shape) {
			if (s instanceof Triangle){
				stype = "Triangle";
				((Triangle) s).setResize(7);
				System.out.printf("%-10s  %5.1f  %5s \n",stype,s.getArea(),s.getColor());
			} else {
				stype = "Rectangle";	
				((Rectangle) s).setResize(7);
				System.out.printf("%-10s  %5.1f  %5s \n",stype,s.getArea(),s.getColor());
			}
		}
	}
}
