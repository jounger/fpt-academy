package model;

public class Rectangle extends Shape {

  private double width;

  private double length;

  @Override
  public double getPerimeter() {
    return (width + length) * 2;
  }

  @Override
  public double getArea() {
    return width * length;
  }

  @Override
  public void printResult() {
    System.out.println("-----Rectangle-----");
    System.out.println("Width: " + width);
    System.out.println("Length: " + length);
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());

  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

}
