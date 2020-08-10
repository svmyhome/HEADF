public class Gav {

    public static void main(String[] args) {
        DogBark dog1 = new DogBark();
        DogBark dog2 = new DogBark();
        DogBark dog3 = new DogBark();

        dog1.setName("Tuzik");
        dog2.setName("taksa");
        dog3.setName("Moska");
        dog1.setSize(50);
        dog2.setSize(30);
        dog3.setSize(10);

        dog1.Bark(2);
        dog2.Bark(1);
        dog3.Bark(3);

        int nu1 = dog1.nu();
        System.out.println(nu1);
        System.out.println(dog1.getName() + " " + dog1.getSize());

        DogBark[] pets;
        pets = new DogBark[3];

        pets[0] = new DogBark();
        pets[0].setSize(78);
        pets[0].setName("Bask");
        pets[0].Bark(6);

    }


}
