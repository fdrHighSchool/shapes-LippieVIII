import java.util.*;

public class shapes {
  public static void main(String[] args) {
    ///rectangle
    Scanner scan = new Scanner(System.in);
    System.out.println("1. Enter the dimensions for rectangle: ");
    double length = scan.nextDouble();
    double width = scan.nextDouble();
    double area1 = (length * width);
    rectangle(length, width, scan, area1);
    System.out.println("The area of the rectangle is: " + area1);
    ///square
    Scanner scan2 = new Scanner(System.in);
    System.out.println("2. Enter the length for the square: ");
    double length2 = scan2.nextDouble();
    double area2 = (length2 * length2);
    square(length2, scan2, area2);
    System.out.println("The area of the square is: " + area2);
    ///circle
    Scanner scan3 = new Scanner(System.in);
    System.out.println("3. Enter the length for the radius: ");
    double radius = scan3.nextDouble();
    String area3 = ((radius * radius) + "π");
    circle(radius, scan3, area3);
    System.out.println("The area of the circle is: " + area3);
    ///triangle
    Scanner scan4 = new Scanner(System.in);
    System.out.println("4. Enter the measurement of the base: ");
    double length3 = scan4.nextDouble();
    System.out.println("Enter the measurement of the height: ");
    double height = scan4.nextDouble();
    double area4 = ((length3 * height) / 2);
    triangle(length3, height, scan4, area4);
    System.out.println("The area of the triangle is: " + area4);

  }
  public static void rectangle(double length, double width, Scanner scan, double area1) {
    /// Area = length * width
  }
  public static void square(double length2, Scanner scan2, double area2) {
    /// Area = length^2
  }
  public static void circle(double radius, Scanner scan3, String area3) {
    /// Area = π * r^2
  }
  public static void triangle(double length3, double height, Scanner scan4, double area4) {
    /// Area = (length * heigh) / 2
  }
}
