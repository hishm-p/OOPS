import java.util.*;

public class diamondstar 
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the median position of maximum length of sequence:");
   int num=sc.nextInt();
   int i,j;
   // prints the first half diamond
   for(i=1;i<=num;i++)
    { 
     for(j=1;j<=num-i;j++)
       {
        System.out.print(" ");
       }
     for(j=1;j<=i*2-1;j++)
       {
        System.out.print("*");
       }
     System.out.println();
    } 
    // // Prints the second half diamond
    for(i=num-1;i>0;i--)
    { 
     for(j=1;j<=num-i;j++)
       {
        System.out.print(" ");
       }
     for(j=1;j<=i*2-1;j++)
       {
        System.out.print("*");
       }
     System.out.println();
    } 
  }
 } 
