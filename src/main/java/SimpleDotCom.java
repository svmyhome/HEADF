import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> localCells;
    private int hintNumb = 0;

    public void setLocalCells(ArrayList<String> cells) {
        localCells = cells;
    }

    public String checkYourSelf(String userGuess) {

       String result = "Mimo";
       int index = localCells.indexOf(userGuess);


        if (index >= 0) {
            localCells.remove(index);
            if (localCells.isEmpty()) {
                result = "potopil";
            } else {
                result = "popal";
            }
        }
        System.out.println(result);
        return result;
    }
}
