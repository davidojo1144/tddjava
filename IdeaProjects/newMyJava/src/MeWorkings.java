import java.util.Scanner;
import java.util.ArrayList;
public class MeWorkings {

    public enum Josh {
        JOSHUA,
        SAMUEL,
        DAVID,
        ZION

    }

    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }



    public static void main(String[] args) {
        MeWorkings.Josh josh = Josh.JOSHUA;
        System.out.println("his name is: " + josh);

        Days today = Days.SATURDAY;
        System.out.println("Today is: " + today);

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> score = new ArrayList<>();

        System.out.println("Enter what you'd love to add: ");
        String input = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            score.add(0, input);
        }


        score.add(0, "fish");
        score.add(1, "sheep");
        score.add(2, "sheep");
        score.set(2, "dan");
        System.out.println(input);
        //System.out.println("The scores are: " + score);
            System.out.println("The first element is: " + score.get(0));
            score.set(0, "love");
            System.out.println("The first element is: " + score.get(0));


            int[] numbers = {1,2,3,4,5,6};
            for(int num : numbers) {
                System.out.println("The numbers are: " + num);
            }

            int[] scores = new int[5];
            for(int num = 0; num < scores.length; num++) {
                scores[num] = num;
                System.out.println(scores[num]);
            }

            ArrayList<Integer> datas = new ArrayList<>();
            datas.add(0, 34);
            datas.add(1, 50);
            datas.add(2,78);
            datas.add(3, 100);
            datas.set(3, 200);

            for(int digit : datas) {
                System.out.println("The numbers are: " + digit);

            }
        System.out.println("The first one is: " + datas.get(0));


            ArrayList<Integer> something = new ArrayList<>();
            for(int digits : something) {
                something.add(0,12);
                something.add(1,15);
            }
            System.out.println(something.get(1));








    }
}


