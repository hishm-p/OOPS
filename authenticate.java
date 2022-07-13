import java.util.*;

class exp extends Exception {
    String username, password;

    exp(String s) {
        super(s);
    }

    exp(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class authenticate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        exp a[] = new exp[20];
        int i = -1;
        String user, pass;
        try {
            while (true) {
                System.out.println("1.sign up\n2.login\n3.exit\nenter choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("enter username");
                        user = sc.next();
                        System.out.println("enter password");
                        pass = sc.next();
                        a[++i] = new exp(user, pass);
                        System.out.println("registered");
                        break;
                    case 2:
                        System.out.println("search username");
                        user = sc.next();
                        System.out.println("search password");
                        pass = sc.next();
                        for (int j = 0; j < i + 1; j++) {
                            if (a[j].username.equals(user)) {
                                if (a[j].password.equals(pass)) {
                                    System.out.println("logged in");
                                } else {
                                    throw new exp("not correct");
                                }
                            }
                        }
                        break;
                    case 3:
                        System.exit(1);
                        break;
                }
            }
        } 
        catch (exp e) {
            System.out.println(e.getMessage());
        }
    }
}
