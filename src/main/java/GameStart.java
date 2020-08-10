public class GameStart {
    Player p1;
    Player p2;
    Player p3;

    public void game() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1numb = 0;
        int p2numb = 0;
        int p3numb = 0;

        boolean p1isbool = false;
        boolean p2isbool = false;
        boolean p3isbool = false;

        int target = (int) (Math.random() * 10);
        System.out.println("--------" + target + "---------");

        while(true) {
            p1.generateNumber();
            p2.generateNumber();
            p3.generateNumber();

            p1numb = p1.number;
            p2numb = p2.number;
            p3numb = p3.number;

            if (p1numb == target) {
                p1isbool = true;
            }
            if (p2numb == target) {
                p2isbool = true;
            }
            if (p3numb == target) {
                p3isbool = true;
            }
            if(p1isbool||p2isbool||p3isbool) {
                System.out.println("gamer1 think --->>>" + p1numb);
                System.out.println("gamer2 think --->>>" + p2numb);
                System.out.println("gamer3 think --->>>" + p3numb);
                break;
            } else {
                System.out.println("Play again");
            }
        }
    }
}
