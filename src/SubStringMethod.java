import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String email;
        String userName;
        String domain;

        System.out.print("Welcome back! Enter your email: ");
        email = scanner.nextLine();
        if(email.contains(" ")){
            System.out.print("Invalid email address format! No white space.");
        }else{
            userName = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.print("Your temporary username is '" + userName + "'\nYour domain is '" + domain + "'.");
        }
        scanner.close();
    }
}
