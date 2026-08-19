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

        System.out.print("Enter an adjective (hint: a word describing a noun): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (hint: animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (hint: a word describing a noun): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb (an action word ending with -ing-): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (hint: a word describing a noun): ");
        adjective3 = scanner.nextLine();

        /*
        Output the full story.
        Add the variables into the story
         */

        System.out.println("\nI went to the market this morning and I saw an " + adjective1 + " " + noun1 + ".");
        System.out.println("The " + noun1 + " was not " + adjective2 + ".");
        System.out.println(verb1 + " has become a challenge. The economy is not stable." + "The " + adjective3 + " " + noun1 + " highlighted.");

        scanner.close();
    }
}