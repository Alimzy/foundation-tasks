import java.util.Scanner;
 
 public class SumOfIntegers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter three digit");
int number = input.nextInt();

int firstNumber = number / 100;
int secondNumber = (number % 100) / 10;
int thirdNumber = (number % 10);

 int sum = firstNumber + secondNumber + thirdNumber; 

if(number > 0 && number < 1000){
System.out.println("The sum of the digits is: " + sum);  
}else{
System.out.println("error");
}
}
}
 
