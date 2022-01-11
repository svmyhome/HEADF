package Scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        String s1 = "Exceed salad artist she.";
        Scanner scanner = new Scanner(s1);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
            System.out.println(scanner.hasNext());
            //System.out.println(scanner.nextLine());
        }
        scanner.close();
        String s2 = "Exceed salad artist she." + "Corresponding assurance murder tissue province displays officers, lending. \n" +
                "Rural horn host acids. \n" +
                "Lion self specially brands facts lisa healing, based forestry klein forums retrieve cars burner, harrison bytes sentence ask bandwidth identification shade, given cancer exploration roberts. \n";
        Scanner scanner2 = new Scanner(s2);
        while (scanner2.hasNext()) {
            System.out.println(scanner2.nextLine());
            System.out.println("=====");
        }
        scanner2.close();
    }
}
