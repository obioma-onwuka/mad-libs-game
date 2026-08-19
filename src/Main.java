import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (hint: a word describing a noun):");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (hint: animal or person): ");
        noun1 = scanner.nextLine();


        scanner.close();
    }
}