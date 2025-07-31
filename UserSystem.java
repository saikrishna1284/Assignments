import java.util.Scanner;
public class UserSystem {
    private String registeruserid;
    private String registerpassowrd;
    Scanner sc = new Scanner(System.in);

    public void register(String username,String passowrd){
        username=username.trim();
        passowrd=passowrd.trim();

        if(username.isEmpty() || passowrd.isEmpty()){
            System.out.println("Username or Password cannot be blank");
            return;
        }
        registeruserid=username.toLowerCase();
        registerpassowrd=passowrd;

        System.out.println("Registration Succesful for: "+registeruserid);
        checkPassword();

    }
    public void login(String username,String password){
        if(registeruserid==null || registerpassowrd==null){
            System.out.println("Please Register First");
            return;

        }
        if(registeruserid.equals(username.toLowerCase())&&registerpassowrd.equals(password)){
            System.out.println("Login Succesful!");
        }else{
          System.out.println("Invalid Credentials");
          System.out.print("Forgot Password? Enter a hint (maybe your username): ");
          String hint = sc.nextLine();
          forgotPassword(hint);
        }
    }
    public void forgotPassword(String hint){
        if(hint.toLowerCase().contains(registeruserid)){
            System.out.println("Hint Matched!Your Password is "+registerpassowrd);
        }else{
            System.out.println("Hint doesn't match your username");
        }
    }
    public void checkPassword(){
        if(registerpassowrd.length()<6||registerpassowrd.toLowerCase().equals(registerpassowrd)){
           System.out.println("Weak Passowrd.Use Uppercase and Symbols");
        }else{
            System.out.println("Strong Password");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserSystem us=new UserSystem();
        System.out.println("Enter username:");
        String uname = sc.nextLine();
        System.out.println("Enter password:");
        String pwd = sc.nextLine();
        us.register(uname,pwd);
        System.out.println("Enter username to login: ");
        String loginU = sc.nextLine();
        System.out.println("Enter password: ");
        String loginP = sc.nextLine();
        us.login(loginU, loginP);
        sc.close();
    }
}
