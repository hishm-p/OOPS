import java.util.*;
class CPU
{
 int price;
 CPU(int p)
 {
  this.price = p;
 }
 
 class PROCESSOR
 {
  int cores;
  String manufacturer;
  
 PROCESSOR(int c, String m)
 {
  this.cores = c;
  this.manufacturer = m;
 }
 
  void display()
  {
    System.out.println("Manufacturer : "+manufacturer+"\nCores : "+cores);
  }
 }

 static class RAM
 {
  int memory;
  String manufacturer;
  
  RAM(int n, String m)
   {
      this.memory = n;
      this.manufacturer = m;
   }
  void display()
  {
   System.out.println("Manufacturer : "+manufacturer+"\nMemory : "+memory);
  }

 }

void display()
 {
   System.out.println("Price of CPU : " + this.price);
 }

}

public class nestedclass{
 public static void main(String[] args)
 {  
   CPU cpu1 = new CPU(18000);
   CPU.PROCESSOR processor = cpu1.new PROCESSOR(4,"intel");
   CPU.RAM ram = new CPU.RAM(1024,"Asus");
   cpu1.display();
   processor.display();
   ram.display();
 }

}


