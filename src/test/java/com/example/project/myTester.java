package com.example.project;

public class myTester {
    public static void main(String[] args) {

        Triangle test = new Triangle (1, 1, 2, 1, 1, 2);

        double getPerimeter = test.perimeter();
        double getArea = test.area();
        System.out.println("the area of the triangle is " + getPerimeter + "and should be 0.5");
        System.out.println("the area of the triangle is " + getArea + "and should be 0.5");

        test.translateX(5);
        test.translateY(5);
        System.out.println("the area of the triangle, after translating is " + getArea + "and should be the same");
        System.out.println("the area of the triangle, after translating is " + getPerimeter + "and should be the same");
    }
}
