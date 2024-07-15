import java.util.Scanner;
public class OddAndEven{
public static void main(String...args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number2 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number3 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number4 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number5 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number6 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number7 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number8 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number9 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number10 = scanner.nextInt();



	if (number1 % 2 == 0) System.out.println("number 1 is even");
	else System.out.println("number 1 is odd");
	
	if (number2 % 2 == 0) System.out.println("number 2 is even");
	else System.out.println("number 2 is odd");

	if (number3 % 2 == 0) System.out.println("number 3 is even");
	else System.out.println("number 3 is odd");

	if (number4 % 2 == 0) System.out.println("number 4 is even");
	else System.out.println("number 4 is odd");

	if (number5 % 2 == 0) System.out.println("number 5 is even");
	else System.out.println("number 5 is odd");

	if (number6 % 2 == 0) System.out.println("number 6 is even");
	else System.out.println("number 6 is odd");

	if (number7 % 2 == 0) System.out.println("number 7 is even");
	else System.out.println("number 7 is odd");

	if (number8 % 2 == 0) System.out.println("number 8 is even");
	else System.out.println("number 8 is odd");

	if (number9 % 2 == 0) System.out.println("number 9 is even");
	else System.out.println("number 9 is odd");
	
	if (number10 % 2 == 0) System.out.println("number 10 is even");
	else System.out.println("number 10 is odd");
	

	int sumEven = number2 + number4 + number6 + number8 + number10;
	
	int sumOdd = number1 + number3 + number5 + number7 + number9;

	System.out.println("sum of even is: " + sumEven);
	System.out.println("sum of odd is: " + sumOdd);
	

	}

}

	
	