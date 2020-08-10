import java.util.ArrayList;

public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<String> mass = new ArrayList<String>();
        String a = new String ("2");
        String b = new String ("3");
        String c = new String ("4");
        mass.add(a);
        mass.add(b);
        mass.add(c);

        dot.setLocalCells(mass);
        String userGuess = "5";
        String result = dot.checkYourSelf(userGuess);
        int ra = (int) (Math.random() *5);
        System.out.println(ra);
    }
}
