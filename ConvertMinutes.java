import java.util.Scanner;

 public class ConvertMinutes{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 System.out.println("Enter minutes here:");
 int minutes = input.nextInt();

 int years = minutes / 525600;


 int days =  (minutes % 525600) / 1440;

 System.out.printf("%d minutes is approximately %d in years and %d in days %n", minutes, years, days);
}
 }
