import java.io.*;

public class file3 {
    public static void main(String args[])throws IOException
    {
        FileInputStream rd=new FileInputStream(args[0]);
        FileOutputStream wrt=new FileOutputStream(args[1]);
        int b;
        while((b=rd.read())!=-1)
        {
            wrt.write(b);
        }
        System.out.println("Copy Completed!");
        wrt.close();
        rd.close();
    }
    
}
