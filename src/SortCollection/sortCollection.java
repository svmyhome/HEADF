package SortCollection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class sortCollection {

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new sortCollection().go();
        HashMap<String, Integer> nameIndex = new HashMap<String, Integer>();

        nameIndex.put("id", 3434);
        nameIndex.put("Field", 123);
        nameIndex.put("idd", 1);

        System.out.println(nameIndex);
        System.out.println(nameIndex.get("Field"));
        System.out.println(nameIndex.get("id"));

    }

    public void go() {
        view();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
    void view() {
        try {
            File file = new File("D:\\MyPetProject\\HeadF\\src\\SortCollection\\sortList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void addSong(String lineText) {
        String[] keysList = lineText.split("/");
        songList.add(keysList[0]);
    }
}
