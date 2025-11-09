import java.util.Scanner;

public class Accelleration{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter v0:");
  double v0 = input.nextDouble();

  System.out.println("Enter v1:");
  double v1 = input.nextDouble();

  System.out.println("Enter t:");
  double t = input.nextDouble();

  double AverageAccelleration = (v1 - v0) / t;

 System.out.println("The average acceleration is " + AverageAccelleration);
}
}
