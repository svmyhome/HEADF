public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.age = 40;
        dog.name = "tuzik";
        dog.bark();
        System.out.println(dog.age + " " + dog.name);
    }
}
