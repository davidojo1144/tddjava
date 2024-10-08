public class CalculatingArray {
    public static int[] findMinMax(int[] arr, int arrs)
    {
        int mini = arr[0];
        int max = arr[0];

        for (int num = 0; num < arrs; num++) {
            if (arr[num] < mini) {
                mini = arr[num];
            }
            else if (arr[num] > max) {
                max = arr[num];
            }
        }
        int[] answer = new int[2];
        answer[0] = mini;
        answer[1] = max;
        return answer;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,6,7,8};
        int number = arr.length;


        int[] ans = findMinMax(arr, number);
        System.out.print("Maximum is: " + ans[1]);
        System.out.print("\n" + "Minimum is: " + ans[0]);
    }
}

