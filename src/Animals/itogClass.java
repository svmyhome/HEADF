package Animals;

import Animals.CatsClass;
import Animals.DogClass;

public class itogClass {
    public static void main(String[] args) {
        CatsClass cat = new CatsClass();
        cat.setName("Tiger");
        System.out.println(cat.getName());
        cat.sleep();

        DogClass dog = new DogClass();
        dog.sleep();
        System.out.println(cat.getClass());
        System.out.println(dog.getClass());
        mainAnimal ani1  = new DogClass();
        ani1.setName("Trinity");
        System.out.println(ani1.getName());
        System.out.println(ani1.getClass());
        mainAnimal[] ani2 = new mainAnimal[3];

        ani2[0] = new DogClass();
        ani2[1] = new CatsClass();
        ani2[0].setName("Arr Dog1");
        ani2[1].setName("Arr Cat1");
        System.out.println(ani2[0].getName());
        System.out.println(ani2[1].getName());

        neutral d = new neutral();
        d.allClasses(cat);
        d.allClasses(dog);


    }
}
