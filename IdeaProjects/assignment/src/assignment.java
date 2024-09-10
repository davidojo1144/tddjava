//Import class scanner from java
import java.util.Scanner;
        
        public class ConvertP{
    public static void main(String[] args){
        
        //Create a Scanner instance and assign it to variable input.
        Scanner input = new Scanner(System.in);
        
        //Assign user for a number in pound:.
        System.out.println();
        
        //Assign user input to variable pounds.
        double pounds = input.nextDouble();
        
        //Multiply pounds with 0.454.
        double convertP = pounds * 0.454;
        
        //print out convertP.
        System.out.printf("%.3f", convertP);
        
        
        
        
    }

            }
        



