import java.util.Scanner;

public class ConverFeet{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.println("Enter your feet");
  double feet = input.nextDouble();
  
  double feetToMeter = feet * 0.305;

  System.out.printf("%f feet is %f in meters %n", feet, feetToMeter);
  
}
}
