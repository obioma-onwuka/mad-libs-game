import java.util.Scanner;

public class SupermartGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price = 12.99;
        char currencySymbol = '$';
        int quantity;
        double vat = 7.5 / 100;

        System.out.print("Welcome to our store! \nWhat are you buying today?: ");
        item = scanner.nextLine();
        System.out.print("What is the quantity?: ");
        quantity = scanner.nextInt();
        double total = (price * quantity) + vat;
        System.out.print("\nSummary:");
        System.out.print("Item: " + item + "\nQuantity: " + quantity + "\nPrice each: " + currencySymbol+price + "\nV.A.T: " + vat + "\nTotal: " + currencySymbol+total);
        scanner.close();
    }
}
