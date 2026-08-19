import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Welcome, enter your age: ");
        age = scanner.nextInt();

        // if else statement
        if(age >= 18){
            System.out.print("You are an adult! 👨");
        }else{
            System.out.print("You are a kid! 👧");
        }

        scanner.close();
    }
}
