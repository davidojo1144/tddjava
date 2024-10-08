package animal;

public class Cat extends Animals{
    public void sound(){
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat enjoy their food alone");
    }
}
