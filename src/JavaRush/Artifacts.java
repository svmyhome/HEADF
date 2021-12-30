package JavaRush;

public class Artifacts {

    static int index = 0;
    String culture;
    int age;

    public Artifacts(String culture, int age) {
        index++;
        this.culture = culture;
        this.age = 12;
    }

    public Artifacts(String culture) {
        index++;
        this.culture = culture;
    }

    public Artifacts() {
        index++;
    }

    public static void main(String[] args) {
        Artifacts art1 = new Artifacts("hfcbhb", 32);
        System.out.println(index + " " + art1.culture + " " + art1.age);
        Artifacts art2 = new Artifacts("ncndjncdn");
        System.out.println(index + " " + art2.culture + " " + art2.age);
        Artifacts art3 = new Artifacts();
        System.out.println(index + " " + art3.culture + " " + art3.age);
    }
}
