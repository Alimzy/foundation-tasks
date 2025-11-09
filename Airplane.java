import java.util.Scanner;

public class Airplane{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter Accelleration");
  double accelleration = input.nextDouble();
  
  System.out.println("Enter Speed");
  double speed = input.nextDouble();

  double accelSquare = accelleration * accelleration;

  double speedTwo = speed * 2;

  double runwayLenght =  accelSquare / speedTwo;

  System.out.println("The minimum runway lenght for this airplane is " + runwayLenght);

}
}
