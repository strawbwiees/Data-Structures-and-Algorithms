import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DSA_Sets {
    public static void main(String[] args) {

//HashSet - hindi naka order, bawal duplicate
        HashSet<String> series = new HashSet<>();
            series.add("Blacklist");
            series.add("Bad Buddy");
            series.add("My Dear Loser");
            series.add("The Gifted");
            series.add("The Gifted"); // dupli, ndi mapprint
            System.out.println(series);
            System.out.println(series.size());
            System.out.println(series.contains("Blacklist"));   //checks if element exist sa set
            series.remove("The Gifted");    //remove pero exact element, hindi index

        // Loop
        for (String i : series) {
            System.out.println(i);
        }

//TreeSet
        TreeSet<String> songs = new TreeSet<>(); //bawal din duplicate
        songs.add("Same Page"); //automatically sorted
        songs.add("Just Friends?");
        songs.add("Our Song");
        System.out.println(songs);

        for (String s : songs) {
            System.out.println(s);
        }

        TreeSet<Integer> year = new TreeSet<>();
        year.add(2018);
        year.add(2021);
        year.add(2020);
        System.out.println(year);
        System.out.println(year.size());

//LinkedHashSet
        LinkedHashSet<String> actors = new LinkedHashSet<>(); //bawal parin dupli
        actors.add("Nanon"); //kung ano lang din yun order ng pagka-add
        actors.add("Prim");
        actors.add("Jane");
        actors.add("Fiat");

        for (String a : actors) {
            System.out.println(a);
        }
    }
}
