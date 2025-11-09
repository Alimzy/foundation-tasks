import java.util.Scanner;

public class Velocity{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 System.out.println("Enter initial velocity: ");
 double initialVelocity = input.nextDouble();

 System.out.println("Enter time taken: ");
 double timeTaken = input.nextDouble();

 System.out.println("Enter accelleration: ");
 double accelleration = input.nextDouble();

 double distanceCovered = initialVelocity * timeTaken + (0.5 * accelleration * timeTaken * timeTaken);

 System.out.println("The distance covered is: " + distanceCovered);
}
}
