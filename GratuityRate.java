import java.util.Scanner;

public class GratuityRate{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 System.out.println("Enter subtotal: ");
 double subTotal = input.nextDouble();

 System.out.println("Enter Gratuity: ");
 double gratuity = input.nextDouble();

 double gratuityRate = (subTotal * gratuity) / 100;
 System.out.println("The gratuity is: " + gratuityRate );

 double total = gratuityRate + subTotal;
 System.out.println("The total is: " + total);
 
}
}
