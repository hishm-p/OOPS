import java.util.*;

class fibo implements Runnable
{
    int n;
    Scanner sc1=new Scanner(System.in);
    fibo(){
        System.out.println("Enter range:");
        n=sc1.nextInt();
    }
    public void run()
    {
        int a=0,b=1;
        System.out.println(a+"\n"+b);
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}

class even implements Runnable
{
    int r1,r2;
    Scanner sc=new Scanner(System.in);
    even()
    {
        System.out.println("Enter 1st range:");
        r1=sc.nextInt();
        System.out.println("Enter 2nd range:");
        r2=sc.nextInt();
    }

    public void run()
    {
        for(int i=r1;i<=r2;i++)
        {
            if(i%2==0)
            {
                System.out.println(i + "is even");
            }
        }
    }

}


class thread1
{
    public static void main(String arg[])
    {
        fibo f=new fibo();
        Thread t1=new Thread(f);
        even e=new even();
        Thread t2=new Thread(e);
        t2.start();
        t1.start();
        

    }
}