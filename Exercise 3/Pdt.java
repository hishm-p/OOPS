import java.util.*;

class Product
{
 String pcode,pname;
 int price;
 public Product(String pcode,String pname,int price)
 {
   this.pcode=pcode;
   this.pname=pname;
   this.price=price;
 } 
}

class Pdt
{
 public static void main(String args[])
 {
  Product p1=new Product("1","Product 1",15);
  Product p2=new Product("2","Product 2",25);
  Product p1=new Product("1","Product 3",35);

  if(p1.price<=p2.price && p1.price<=p3.price)
  {
     System.out.println("The Produst having lowest price is: "+p1.pname);  
  }
  else if(p2.price<=p1.price && p2.price<=p3.price)
  {
     System.out.println("The Produst having lowest price is: "+p2.pname);  
  }
  else
  {
     System.out.println("The Produst having lowest price is: "+p3.pname);  
  } 
 }
}
