import java.util.Scanner;
 public class FutureInvestment{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.println("Enter investment amount here:");
  double amount = input.nextDouble();

  System.out.println("Enter annual interest");
  double annualInterest = input.nextDouble();

  System.out.println("Enter number of years");
  double numberYears = input.nextDouble();
 

  double monthlyInterest = annualInterest/1200;

  double futureInvestmentValue = amount * Math.pow(1 + monthlyInterest, numberYears * 12);

  System.out.println("The future investment is: " + futureInvestmentValue );
  
}
}
 
