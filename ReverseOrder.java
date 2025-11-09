import java.util.Scanner;
 public class ReverseOrder{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter four numbers");
  int number = input.nextInt();
  
  int numberOne = number / 1000;
  int numberTwo = (number / 100) % 10;
  int numberThree = (number / 10) % 10;
  int numberFour = number % 10;

  System.out.printf("%d%d%d%d",numberFour,numberThree,numberTwo,numberOne);
}
}
