import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class DSA_Lists {
    public static void main(String[] args) {

// ARRAY LIST - naka order depends sa paglagay
        //String
        ArrayList<String> names = new ArrayList<>(); // PWEDE VAR INSTEAD ARRAYLIST SA UNA layk: var names = new ArrayList<>();
        names.add("Noella");
        names.add("Nanon");
        names.add("Chayapol");
        names.add("Chayakorn");
        names.add("Ohm");
        names.set(3, "JJ");         // pang replace, index number yung gagamitin (index, new)
        names.remove(4);            // remove, index din, clear kapag all elements aalisin
        System.out.println(names);

        //Naka alphabetical sort, tapos naka next line
        Collections.sort(names);
        for (String i : names) {
            System.out.println(i);
        }

        //Int
        ArrayList<Integer> age = new ArrayList<>();
        age.add(19);
        age.add(30);
        age.add(25);
        Collections.sort(age);
        System.out.println("Ascending:" + age);
        Collections.sort(age, Collections.reverseOrder());
        System.out.println("Reverse:" + age);


        var initials = new ArrayList<>();
        initials.add('N');
        initials.add('N');
        initials.add('C');
        System.out.println(initials);

 // LINKED LISTS
        var thaiSeries = new LinkedList<String>();
        thaiSeries.addFirst("Bad Buddy");
        thaiSeries.add("My Dear Loser");
        thaiSeries.addLast("2gether");
        System.out.println(thaiSeries.getFirst()); // Bad Buddy
        System.out.println(thaiSeries);

    }
}

