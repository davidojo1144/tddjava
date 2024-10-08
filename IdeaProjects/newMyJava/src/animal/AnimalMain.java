package animal;

public class AnimalMain {
    public static void main(String[] args) {

    Animals myDog = new Dog();
    Animals myCat = new Cat();
    Animals myAnimals = new Animals();

   myDog.sound();
   myDog.eat();

   System.out.println();

   myCat.sound();
   myCat.eat();

   System.out.println();

   myAnimals.sound();
   myAnimals.eat();


    }

}

