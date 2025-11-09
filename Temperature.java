import java.util.Scanner;
  public class Temperature{ 
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the amount of water");
   double amountWater = input.nextDouble();

   System.out.println("Enter the initial Temperature");
   double initialTemperature = input.nextDouble();
   
   System.out.println("Enter the final Temperature");
   double finalTemperature = input.nextDouble();

   double energyNeeded = amountWater * (finalTemperature - initialTemperature) * 4184;
   
   System.out.println("The enery needed is: " + energyNeeded);
}
}
