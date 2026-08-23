import java.util.Scanner;

public class MathHypotenuse {
    public static void main(String[] args){
        // calculating the hypotenuse C of a given triangle

        Scanner scanner = new Scanner(System.in);
        double c;
        double a;
        double b;

        System.out.print("Enter the value of the side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of the side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("The hypotenuse C of a given triangle is: " + c + "cm");
    }

}
