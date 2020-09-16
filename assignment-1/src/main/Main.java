package main;

import java.util.Scanner;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("=====Calculator Shape Progarmer=====");
    System.out.println("Please input side width of Rectangle:");
    double width = scan.nextDouble();
    System.out.println("Please input length of Rectangle:");
    double length = scan.nextDouble();
    Rectangle rect = new Rectangle();
    rect.setWidth(width);
    rect.setLength(length);

    System.out.println("Please input radius of Circle:");
    double radius = scan.nextDouble();
    Circle circle = new Circle();
    circle.setRadius(radius);

    System.out.println("Please input side A of Triangle:");
    double sideA = scan.nextDouble();
    System.out.println("Please input side B of Triangle:");
    double sideB = scan.nextDouble();
    System.out.println("Please input side C of Triangle:");
    double sideC = scan.nextDouble();
    Triangle triangle = new Triangle();
    triangle.setSideA(sideA);
    triangle.setSideB(sideB);
    triangle.setSideC(sideC);

    scan.close();

    rect.printResult();
    circle.printResult();
    triangle.printResult();
  }

}
