import java.util.*;
class fib implements Runnable{
    int n;
    fib(int n){
        this.n=n;
    }
    public void run(){
    int a=0,b=1;
    System.out.print(a+" "+b);
    for(int i=0;i<n;i++){
    int c=a+b;
    System.out.print(" "+c);
    a=b;
    b=c;
    }
    }
}
class even implements Runnable{
    int n;
    even(int n){
        this.n=n;
    }
    public void run(){
    for(int i=0;i<n;i++){
        if(i%2==0){
            System.out.print(" "+i);
        }
    }
    }
}
public class thread{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        fib f=new fib(n);
        Thread t1=new Thread(f);
        even e=new even(n);
        Thread t2=new Thread(e);
        t1.start();
        t2.start();
        
    }
}