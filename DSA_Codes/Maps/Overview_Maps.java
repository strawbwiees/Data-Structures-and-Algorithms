import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Overview_Maps {
    public static void main(String[] args) {

        // HashMap - bawal dupli sa key, pero sa value pwede
        HashMap<String, Integer> moviesAndYear = new HashMap<>();
        moviesAndYear.put("Project Hail Mary", 2026);
        moviesAndYear.put("Weapons", 2026);
        moviesAndYear.put("The Medium", 2021);
        System.out.println(moviesAndYear);
        System.out.println(moviesAndYear.get("Project Hail Mary")); //returns its value
        System.out.println(moviesAndYear.containsKey("Weapons")); //check if exists

        for (String i : moviesAndYear.keySet()) {
            System.out.println("movie: " + i + " year: " + moviesAndYear.get(i));
        }

        //TreeMap - automatically sorted na
        TreeMap<String, String> songArtists = new TreeMap<>();
        songArtists.put("Same Page","Tilly Birds");
        songArtists.put("Beaches", "Beabadoobee");
        songArtists.put("Cute Cute", "Nanon");
        System.out.println(songArtists);

        for(String i : songArtists.keySet()){
            System.out.println("song: " + i + " artist: " + songArtists.get(i));
        }

        //LinkedHashMap
        LinkedHashMap<String, String> partner = new LinkedHashMap<>();
        partner.put("Noella","Nanon");
        partner.put("Ohm","Nanon");
        partner.put("Jungkook","Jimin");
        System.out.println(partner);

        for(String i : partner.keySet()){
            System.out.println("partner1: " + i + " || partner2: " + partner.get(i));
        }

    }
}
