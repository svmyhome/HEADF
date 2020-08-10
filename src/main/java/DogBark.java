public class DogBark {
    private int size;
    private String name;

    public void setSize(int n) {
        size = n;
    }

    public void setName(String n) {
        name = n;
    }

    public int getSize() {
        return size;
    }

    public String getName(){
        return name;
    }

    int nu() {

        return 42;
    }

    void Bark(int numB) {

        while (numB > 0) {
            if (size > 30) {
                System.out.println("Gav");
            }
            if ((size <= 30) && (size > 10)) {
                System.out.println("Tuaf");
            }
            if (size <= 10) {
                System.out.println("aff");
            }
            numB = numB - 1;
        }

    }
}
