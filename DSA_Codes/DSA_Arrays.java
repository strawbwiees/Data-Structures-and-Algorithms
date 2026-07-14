import java.util.Arrays;

public class DSA_Arrays {
    public static void main(String[] args) {

        String[] names = new String[5]; // or {item, item, item}
        names[0] = "Nanon";
        names[1] = "Noella";
        names[2] = "Jane";
        names[3] = "Prim";
        names[4] = "Ohm";
        names[4] = "Pawat"; // change element value

        System.out.println(names); // prints different
        System.out.println(Arrays.toString(names)); // prints actual elements
        System.out.println(names[0]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
