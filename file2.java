import java.io.*;

class file2
{
    public static void main(String args[]) throws IOException,EOFException
    {
        FileInputStream rd=new FileInputStream("f1.txt");
        FileOutputStream wrt=new FileOutputStream("f1.txt");
        String data="This is a sample text put on here";
        byte ar[]=data.getBytes();
        wrt.write(ar);
        wrt.close();
        int b;
        while((b=rd.read())!=-1)
        {
            System.out.print((char)b);
        }
        rd.close();
    }
}
