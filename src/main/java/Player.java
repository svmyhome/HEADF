public class Player {
    int number = 0;

    void generateNumber() {
        number = (int) (Math.random() *10);
        System.out.println("Player think --->>" +number);
    }
}
