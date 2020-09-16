package model;

public class Circle extends Shape {

  private double radius;

  @Override
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public void printResult() {
    System.out.println("-----Circle-----");
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

}
