public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();

        movie1.title = "First";
        movie2.title = "Second";
        movie3.title = "Therd";

        movie1.ganre = "fiction";
        movie2.ganre = "action";
        movie3.ganre = "historical";

        movie1.raiting = 4;
        movie2.raiting = 1;
        movie3.raiting = 5;

        movie1.play();
        movie2.play();
        movie3.play();

    }
}
