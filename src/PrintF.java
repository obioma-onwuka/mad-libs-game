public class PrintF {
    public static void main(String[] args){
        // This is to demonstrate the printf feature

        String name = "Adam";
        char firstLetter = 'A';
        int age = 31;
        double height = 17.25;
        boolean isEmployed = true;
        double price1 = 90000.28;
        double price2 = 90000.28;
        double price3 = -90000.28;
        double price4 = 90000.28;

        int id1 = 1;
        int id2 = 20;
        int id3 = -300;

        System.out.printf("Hello %s\n", name);
        System.out.printf("%c is the first letter of your name %s\n", firstLetter, name);
        System.out.printf("You are %d years old! While your height is %.2fcm\n", age, height); // notice %.2f - used to round to 2 decimal places
        System.out.printf("Your employment status says: %b\n", isEmployed);
        System.out.printf("With Plus: %+.2f\n", price1);
        System.out.printf("With Comma: %,.2f\n", price2);
        System.out.printf("With Bracket: %(.2f\n", price3);
        System.out.printf("With Space: % .2f\n", price4);

        System.out.printf("Zero: %03d\n", id1);
        System.out.printf("Positive: %4d\n", id2);
        System.out.printf("Negative: %-4d", id3);
    }
}
