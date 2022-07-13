import java.util.*;

interface Shape{
    public void area();
    public void perimeter();
}

class Circle implements Shape
{
    float r;

    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r=sc.nextFloat();
        System.out.println("The Area of the Circle is: "+ 3.14*r*r);
        

    }

    public void perimeter()
    {
        System.out.println("The Perimeter of the Circle is: "+ 2*3.14*r);
    }
    
}

class Rectangle implements Shape
{
    float l,b;

    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        l=sc.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        b=sc.nextFloat();
        System.out.println("The Area of the rectangle is: "+ l*b);
        

    }

    public void perimeter()
    {
        System.out.println("The Perimeter of the rectangle is: "+ 2*(l+b));
    }
    
}

public class testinterface1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        Circle c1=new Circle();

        Rectangle r1=new Rectangle();

        int ch,flag=1;

        while(flag!=0)
        {
            System.out.println("Select an option:");
            System.out.println("1 for Circle");
            System.out.println("2 for Rectangle");

            ch = sc.nextInt();
            if(ch==1)
            {
                c1.area();
                c1.perimeter();
            }
            else if(ch==2)
            {
                r1.area();
                r1.perimeter();
            }
            else
            {
                System.out.println("Invalid Choice");

            }
            System.out.println("Do u want to continue?Press 0 to exit");
            flag=sc.nextInt();

        }


    }
}
