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

    }
}
