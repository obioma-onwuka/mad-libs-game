import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // declarations
        double weight;
        double newWeight;
        int choice;

        // output information
        System.out.println("WEIGHT CONVERTER PROGRAM!");
        System.out.println("1: Convert from pounds (lbs) to kilograms (kgs)");
        System.out.println("1: Convert from kilograms (kgs) to pounds (lbs)");
        System.out.print("--------------------------\n");

        // collect user choice
        System.out.print("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();

        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();

        if(choice == 1){
            newWeight = weight * 0.453592;
            System.out.printf("Your weight in kilograms (kgs) is: %.2f", newWeight);
        }else if(choice == 2){
            newWeight = weight * 2.20464;
            System.out.printf("Your weight in pounds (lbs) is: %.2f", newWeight);
        }else{
            System.out.print("Invalid choice. You are mad 😑😑");
        }

        scanner.close();
    }
}
