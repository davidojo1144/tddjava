package display;

import java.util.Arrays;

public class Display {
    public static void main(String[] args) {
        Display display = new Display();
       int[][] arr = {{1, 1, 0}, {0, 1, 0}, {1, 1, 0}};
        String answer = Arrays.toString(display.checkArray(arr));
        System.out.println("The answer is: " + answer);

    }

    public String[][] checkArray(int[][]arr) {
        String [][] array = new String[arr.length][arr.length];
        for (int num = 0; num < array.length; num++) {
            for (int number = 0; number < array.length; number++) {
                if (arr[num][number] == 1) {
                    array[num][number] = "*";
                }
                else if (arr[num][number] == 0) {
                    array[num][number] = " ";
                }

                }
            }
        return array;
        }

    }




