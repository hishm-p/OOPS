import java.util.*;

class Rectangle
{
 int length,breadth,area;
 Scanner scan=new Scanner(System.in);

 public void readData()
 {
  System.out.println("Enter length of rectangle: ");
  length=scan.nextInt();
  System.out.println("Enter breadth of retangle: ");
  breadth=scan.nextInt();
 }

 int area()
  {   
     readData();
     area=length*breadth;
     return area;  
  } 
}

class RectArea
{
 public static void main(String args[])
 {
  Rectangle first=new Rectangle();
  Rectangle second=new Rectangle();

  System.out.println("Area of the first rectangle: "+ first.area());
   
  System.out.println("Area of the second rectangle: "+ second.area());
 }
}
