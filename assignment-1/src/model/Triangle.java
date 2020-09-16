package model;

public class Triangle extends Shape {

  private double sideA;

  private double sideB;

  private double sideC;

  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }

  @Override
  public double getArea() {
    double p = (sideA + sideB + sideC) / 2;
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
  }

  @Override
  public void printResult() {
    System.out.println("-----Circle-----");
    System.out.println("Side A: " + sideA);
    System.out.println("Side B: " + sideB);
    System.out.println("Side C: " + sideC);
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());
  }

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }

  public double getSideC() {
    return sideC;
  }

  public void setSideC(double sideC) {
    this.sideC = sideC;
  }

}
