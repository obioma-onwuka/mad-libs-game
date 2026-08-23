import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Welcome, enter your age: ");
        age = scanner.nextInt();

        // if else-if statement
        if(age == 0){
            System.out.print("You are not yet born! 😇");
        }else if(age >=70){
            System.out.print("You are too old! 👴");
        }else if(age >= 18){
            System.out.print("You are an adult! 👨");
        }else{
            System.out.print("You are a kid! 👧");
        }
        scanner.close();
    }
}
