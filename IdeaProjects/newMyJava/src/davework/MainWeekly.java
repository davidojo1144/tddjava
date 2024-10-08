package davework;

import java.util.Scanner;

public class MainWeekly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Yabatech. \nWe offer lots of subjects.");
        System.out.println("Enter days of the week from monday to thursday to see the subject offered");
        String userInput = scanner.nextLine();
        Weekly.Days day = Weekly.Days.valueOf(userInput);
        System.out.println(day.getUsage());



    }
}
