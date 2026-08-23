import java.util.Scanner;

public class MathPiEtc {
    public static void main(String[] args){
        // circumference: 2pieR
        // area: pieRSquare
        // volume: 4/3PieRSquare
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;
        double pie = 3.14786904328; // to demonstrate printf and %.nf feature where n = decimal point value

        System.out.print("Enter the value of the radius (R): ");
        radius = scanner.nextDouble();

        // circumference
        circumference = 2 * Math.PI * radius;
        // area
        area = Math.PI * Math.pow(radius, 2);
        //volume
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 2);
        System.out.println("The circumference of the circle with radius: " + radius + " is: " + circumference + "cm");
        System.out.println("The area of the circle with radius: " + radius + " is: " + area + "cm^2");
        System.out.println("The volume if radius: " + radius + " is: " + volume + "cm^3");
        System.out.printf("The brief PI is: %.2f", pie); // demonstrates printf, with %.2f where 2 = two decimal places.
    }
}
