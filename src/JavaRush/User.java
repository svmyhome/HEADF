package JavaRush;

public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(short age, int height, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(int height, String name, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args) {
        User user1 = new User("Pety", (short)455, 148);
        User user2 = new User((short) 1345, 148, "Vasy");
        User user3 = new User(148, "Zina", (short) 1345);
        System.out.println(user1.name + " " + user1.age + " " + user1.height);
        System.out.println(user2.name + " " + user2.age + " " + user2.height);
        System.out.println(user3.name + " " + user3.age + " " + user3.height);
    }

}
