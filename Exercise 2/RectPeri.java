import java.util.*;

class Rectangle
{
 int length,breadth,peri;
 Scanner scan=new Scanner(System.in);

 public Rectangle()
 {
  System.out.println("Enter length of rectangle: ");
  length=scan.nextInt();
  System.out.println("Enter breadth of rectangle: ");
  breadth=scan.nextInt();
 }
 
 public Rectangle(int l,int b)
 {
  length=l;
  breadth=b;
 }

 int peri()
  {   
     peri=2*(length+breadth);
     return peri;  
  } 
}

class RectPeri
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  Rectangle first=new Rectangle();
  System.out.println("Perimeter of the first rectangle: "+ first.peri());
  
  System.out.println("Enter length of second rectangle: ");
  int l2=scan.nextInt();
  System.out.println("Enter breadth of second rectangle: ");
  int b2=scan.nextInt();
  Rectangle second=new Rectangle(l2,b2); 
  System.out.println("Perimeter of the second rectangle: "+ second.peri());
 }
}
