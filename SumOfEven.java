import java.util.Scanner;

public class SumOfEven{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.println("input integer one");
 int integerOne = input.nextInt();

 System.out.println("input integer two");
 int integerTwo = input.nextInt();

 System.out.println("input integer three");
 int integerThree = input.nextInt();

System.out.println("input integer four");
 int integerFour = input.nextInt();

System.out.println("input integer five");
 int integerFive = input.nextInt();

int even = 0;
int odd = 0;

if(integerOne % 2 == 0){
even = even + integerOne;
}else{
odd = odd + integerOne;
}

if(integerTwo % 2 == 0){
even = even + integerTwo;
}else{
odd = odd + integerTwo;
}

if(integerThree % 2 == 0){
even = even + integerThree;
}else{
odd = odd + integerThree;
}

if(integerFour % 2 == 0){
even = even + integerFour;
}else{
odd = odd + integerFour;
}

if(integerFive % 2 == 0){
even = even + integerFive;
}else{
odd = odd + integerFive;
}
System.out.println("The sum of even number is " + even);
System.out.println("The sum of odd number is " + odd);



}
}
