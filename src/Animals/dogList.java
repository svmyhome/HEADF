package Animals;

public class dogList extends mainAnimal{

    private DogClass[] dogs = new DogClass[3];
    private int nextIndex = 0;

    public void add(DogClass d) {
        if(nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            nextIndex++;
            System.out.println("added " + d);
        } else {
            System.out.println("Перебор");
        }
    }

    @Override
    public void eat() {

    }
}
