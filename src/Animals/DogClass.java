package Animals;

import Animals.mainAnimal;

public class DogClass extends mainAnimal implements ObjectPetsInterface{

    @Override
    public void eat() {
        System.out.println("Bones");
    }


    public void sleep() {
        System.out.println("UUUUUUUUUUUUUUUUUUUUU");
    }

    @Override
    public void beFriendly() {
        System.out.println("I am beFriendly");
    }

    @Override
    public void pay() {
        System.out.println("I am pay");
    }
}
