package animal;

public class Dog extends Animals{
    public void sound(){
        System.out.println("Dog barks");
    }


    @Override
    public void eat(){
        System.out.println("Dog eats everything in their way");
    }
}
