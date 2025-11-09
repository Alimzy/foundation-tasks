import java.util.Scanner;

public class Mile{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter Mile:");
  double mileTwo = input.nextDouble();

  double kilometer = mileTwo * 1.6;

  System.out.printf("%f mile is %f kilometers %n", mileTwo, kilometer);
}
}
