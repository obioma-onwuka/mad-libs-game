import java.util.Scanner;
import java.util.Random;

public class StringOperations {
    public static void main(String[] args){
        // String operations using String built-in classes

        Scanner scanner = new Scanner(System.in);
        String name;
        int length;
        int guessNumber;
        String guess;
        char index;

        System.out.println("Welcome to FUN GAME part 2!");
        System.out.print("Kindly enter your full name: ");

        name = scanner.nextLine();
        length = name.length();


        System.out.println("Hello " + name + "! \nYour full name's length is: " + length);
        System.out.print("Since the length of your name is: " + length + ", enter any number between 0 to " + length + " to get a character from your name '" + name + "': ");
        guess= scanner.nextLine();

        guessNumber = Integer.parseInt(guess);

        index = name.charAt(guessNumber);

        System.out.print("Your guess number was " + guessNumber + " and the character in that position is: " + index);

        scanner.close();

    }
}
