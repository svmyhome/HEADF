package Animals;

public class animalList extends mainAnimal{

    private mainAnimal[] animals = new mainAnimal[3];
    private int index = 0;

    public void addAnimal(mainAnimal A) {
        if (index < animals.length) {
            animals[index] = A;
            System.out.println("Added " + A);
            index++;
        } else {
            System.out.println("Перебор");
        }

    }

    @Override
    public void eat() {

    }
}
