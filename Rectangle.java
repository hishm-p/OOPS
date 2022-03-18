import java.util.*;

class Rectangle
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter length of the rectangle: ");
  int length=scan.nextInt();
  System.out.println("Enter breadth of the retangle: ");
  int breadth=scan.nextInt();
  
  System.out.println("Area of the rectangle: "+length*breadth);
 }
}
