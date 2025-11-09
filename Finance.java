import java.util.Scanner;

 public class Finance{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Balance");
  double balance = input.nextDouble();
  System.out.println("Enter Interest Rate");
  double interestRate = input.nextDouble();
  
  double interest = balance * (interestRate / 1200);

  System.out.println("Interest for the next month is: " + interest);

}
}
