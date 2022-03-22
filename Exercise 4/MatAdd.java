import java.util.*;

class Matrix  
{
 Scanner scan=new Scanner(System.in);
 int m,n;
 int a[][]=new int[30][30];
 int res[][]=new int[30][30];
 public void writeData() 
 {
 System.out.println("Enter the no of rows?");
 m=scan.nextInt();
 System.out.println("Enter the no of columns?");
 n=scan.nextInt();
 System.out.println("Enter the matrix: ");
 for(int i=0;i<m;i++)
    {
     for(int j=0;j<n;j++)
      {
        a[i][j]=scan.nextInt();
      }
    }
 } 
 public int display()
 {
  for(int i=0;i<m;i++)
    {
     for(int j=0;j<n;j++)
      {
        System.out.print(a[i][j]+"  ");
      }
      System.out.println("");
    }
   return 0;
 }
 public void add(Matrix other) 
  {
    for(int i=0;i<m;i++)
    {
     for(int j=0;j<n;j++)
      {
        res[i][j]=this.a[i][j]+other.a[i][j];
        System.out.print(res[i][j]+"  ");
      }
      System.out.println("");
    }
  }

}

class MatAdd
{
 public static void main(String args[])
 { 
  Matrix mat1=new Matrix();
  Matrix mat2=new Matrix();
 
  mat1.writeData();
  mat2.writeData();
  
  System.out.println("The First Matrix is: ");
  mat1.display();
  System.out.println("The Second Matrix is: ");
  mat2.display();
  
  System.out.println("The Final Matrix is: ");
  mat1.add(mat2);
  
 }

}
