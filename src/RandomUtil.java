import java.util.Random;

public class RandomUtil {
    public static void main(String[] args){
        Random random = new Random();

        // Random numbers / no bounds
        /*

        int number;
        number = random.nextInt();
        System.out.print(number);

         */

        // Random numbers / with bounds
        /*

            int number;
            number = random.nextInt(1,6);
            System.out.print(number);

         */

        // Random double
        /*

            double number;
            number = random.nextDouble();
            System.out.print(number);

         */

        // Random boolean

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.print("HEADS");
        }else {
            System.out.print("TAILS");
        }
    }
}
