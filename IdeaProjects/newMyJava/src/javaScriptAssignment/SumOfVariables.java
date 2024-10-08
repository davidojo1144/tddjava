package javaScriptAssignment;

public class SumOfVariables {
    public static int summing(int x, int y){
       int sum = x + y;
       return sum * 2;
    }

    public static int division(int num){
        int divide = num % 10;
        int sum = divide + num;
        return sum;
    }

    public static int resultingValue(int x, int n){
        return summing(n, x);
    }
}
