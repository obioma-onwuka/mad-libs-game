public class TernaryOperations {
    public static void main(String[] args){
        // Ternary Operations used in place of IF statement
        /*
        Returns one of two results if a condition is True.
         */

        int score = 55;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";

        int num1 = 50;
        int num2 = 6;

        String output = (num1 % num2 == 0) ? "EVEN" : "ODD";

        System.out.println("Result: " + passOrFail);
        System.out.print("Odd or Even?:" + output);
    }
}
