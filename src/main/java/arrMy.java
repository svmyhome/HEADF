import java.util.ArrayList;

public class arrMy {
    public static void main(String[] args) {
        ArrayList<String> Mylist = new ArrayList<String>();
        String s = new String("Hello");
        String b = new String("World");
        Mylist.add(s);
        Mylist.add(b);
        System.out.println(Mylist.size());
        System.out.println(Mylist.get(0));
        System.out.println(Mylist.contains(b));
        ArrayList<Dog> myLd = new ArrayList<Dog>();
        Dog dog1 = new Dog();
        dog1.name = "ttttt";
        myLd.add(dog1);
        System.out.println(myLd.get(0).name);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        ArrayList<Object> ArrO = new ArrayList<Object>();
        Dog dA = new Dog();
        CatL cA = new CatL();
        dA.name = "Dog Array";
        ArrO.add(dA);
        ArrO.add(cA);

        Dog dA2 = (Dog) ArrO.get(0);
        System.out.println(dA2.name);

        try {
            Dog dA3 = (Dog) ArrO.get(1);
            //dA3.Play();
    } catch(
    Exception e)

    {
        System.out.println("ERRRRRRRR");
    }
}
}