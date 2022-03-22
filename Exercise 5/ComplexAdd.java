import java.util.*;

class Complex  
{
 Scanner scan=new Scanner(System.in);
 int real,img; 

 public void writeData() 
 {
 System.out.println("Enter the real part?");
 this.real=scan.nextInt();
 System.out.println("Enter the imaginary part?");
 this.img=scan.nextInt();
 }

 public void display()
 {
  System.out.println(this.real+"+"+this.img+"i");
 }
 
 public void add(Complex other)
 {
  Complex res=new Complex();
  res.real=this.real+other.real;
  res.img=this.img+other.img;
  System.out.println(res.real+"+"+res.img+"i");
 } 

}

class ComplexAdd
{
 public static void main(String args[])
 { 
  Complex cm1=new Complex();
  Complex cm2=new Complex();
  
  System.out.println("Enter the First Complex Number");
  cm1.writeData();
  System.out.println("Enter the second Complex Number");
  cm2.writeData();
  
  System.out.println("The First Complex Number is: ");
  cm1.display();
  System.out.println("The Second Complex Number is: ");
  cm2.display();
  
  System.out.println("The Resultant Complex Number is: ");
  cm1.add(cm2);
  
 }

}
