import main.java.java1;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("I am managed");
        System.out.println("this world");
        java1 ja = new java1();
        ja.name = "Small";

        java1 ja1 = new java1();
        ja1.name = "Medium";
        int jjjj = ja1.age(15);
        System.out.println(jjjj);
        java1 ja2 = new java1();
        ja2.name = "large";

        ja.bark(5);
        ja1.bark(80);
        ja2.bark(101);
    }
}
