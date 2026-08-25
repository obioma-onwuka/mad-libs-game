import java.util.Scanner;

public class StringOperationsPt2 {
    public static void main(String[] args){
        // Further String operations using in-built methods/classes

        Scanner scanner = new Scanner(System.in);

        // Request user to enter name and collect input via scanner class stored to the name string variable.
        System.out.print("Welcome, What is your full name: ");
        String name = scanner.nextLine();

        // 1. check if string input from user is empty using .isEmpty()
        if(name.isEmpty()){
            System.out.print("Game over, you didn't provide any data. Try again later!");
        }else{
            // 2. Lower case using .toLowercase()
            String lowered = name.toLowerCase();
            System.out.println("The lower case version of: " + name + " is '" + lowered + "'.");

            // 3. string length using .length()

            int length = name.length();
            int lengthRange = length - 1;
            System.out.println("The length of '" + name + "' is: " + length);

            // 4. get the index (position) of any given char using .charAt()
            /*
                To spicy it up, I will use scanner to ask user to provide a given index.
                Then convert input to int.
             */
            System.out.print("Since the length of " + name + " is " + length + ", enter numbers between 0 and " + lengthRange + ": ");

            String userIndexAsString = scanner.nextLine();
            // Convert userIndexAsString to int using the Integer.ParseInt() method
            int userIndexAsInt = Integer.parseInt(userIndexAsString);
            // then get the index position of a char off userIndexAsInt using .charAt(...)
            char letter = name.charAt(userIndexAsInt);
            System.out.println("The character from your name " + name + " bases-off the index " + userIndexAsInt + " is: " + letter);

            // 5. convert user input to upper case using .toUpperCase
            String nameToUpper = name.toUpperCase();
            System.out.println("The upper case version of " + "'" + name + "' is: " + nameToUpper);

        }


        scanner.close();
    }
}
