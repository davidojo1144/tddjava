public class Throwing {
    public void checkScore(int score) {
        if (score <= 0) {
            throw new IllegalArgumentException("Score cannot be negative or less than zero");
        }
        else if (score >= 10 && score <= 20) {
            System.out.println("The score is kinda valid!: " + score);
        }
        else {
            System.out.println("The score is very valid!: " + score);
        }
    }

    public static void main(String[] args) {
        Throwing get = new Throwing();

        try {
            get.checkScore(0);
        }

        catch (IllegalArgumentException b) {
            System.out.println(b.getMessage());
        }
    }

}