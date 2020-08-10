public class PhraseGenerator {
    public static void main(String[] args) {
        String[] mass1 = {"zero", "first", "second", "terd"};
        String[] mass2 = {"white", "yellow", "black", "brown"};
        String[] mass3 = {"onion", "peach", "forq", "knife"};

        int len1 = mass1.length;
        int len2 = mass2.length;
        int len3 = mass3.length;

        int numb1 = (int) (Math.random() * len1);
        int numb2 = (int) (Math.random() * len2);
        int numb3 = (int) (Math.random() * len3);

        System.out.println(mass1[numb1] + " " + mass2[numb2] + " " +mass3[numb3]);
    }
}
