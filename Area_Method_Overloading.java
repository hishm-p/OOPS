import java.util.*;
class Area_Method_Overloading
{
	void area(float l,float b)
	{
		System.out.println("\n\tArea of Rectangle is : "+l*b);
	}
	void area(double r)
	{
		System.out.println("\n\tArea of Circle is : "+3.14*r*r);
	}
	void area(float a)
	{
		System.out.println("\n\tArea of Square is : "+a*a);
	}
public static void main(String args[])
{
	Area_Method_Overloading ar=new Area_Method_Overloading();
	Scanner s=new Scanner(System.in);
	System.out.println("\nEnter the side of square : ");
	float a=s.nextFloat();
	ar.area(a);
	System.out.println("\nEnter the length of the rectangle : ");
	float l=s.nextFloat();
	System.out.println("Enter the breadth of the rectangle : ");
	float b=s.nextFloat();
	ar.area(l,b);
	System.out.println("\nEnter the radius of the circle : ");
	Double r=s.nextDouble();
	ar.area(r);
}
}	



import java.util.*;
class Matrix_Symmetric
{

	public static void main(String args[])
	{
		int i,j,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r=s.nextInt();
		System.out.println("Enter the number of columns : ");
		int c=s.nextInt();

		int a[][]=new int[r][c];
		int t[][]=new int[r][c];
		
		if(r!=c)
		{
			System.out.println("\n\n---NOT A SQUARE MATRIX---");
		}
		else
		{
			System.out.println("Enter the matrix : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
			for(i=0;i<r;i++)
			{	
				for(j=0;j<c;j++)
				{
					t[j][i]=a[i][j];
				}
			}
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]!=t[i][j])
					{
						flag=1;
					}
				}
			}

			if(flag==1)
				{
					System.out.println("\n\n---IS NOT A SYMMETRIC MATRIX---");
				}
			else
				{
					System.out.println("\n\n---IS A SYMMETRIC MATRIX---");
				}
			System.out.println("\n\n------DISPLAYING MATRICES------");
			System.out.println("----MATRIX----");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}

			System.out.println("----TRANSPOSED MATRIX----");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(t[i][j]+"\t");
				}
				System.out.println();
			}
		}


	}
}                                                                                                                          
