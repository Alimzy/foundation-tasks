import java.util.Scanner;

public class ConvertPounds{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.println("Enter weight in pounds");
  double weightPounds = input.nextDouble();
  double  weightKilogram = weightPounds * 0.454;

  System.out.printf("%f pounds is %f in weightKilogram %n",weightPounds, weightKilogram);
}
}
