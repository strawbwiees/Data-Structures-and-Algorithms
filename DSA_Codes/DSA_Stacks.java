import java.util.Stack;

public class DSA_Stacks {
    public static void main (String[] args) {

/*
OVERVIEW
Stacks - LIFO: last in first out (last inserted will be the first item to be removed.
- Can only add/take/peek at the top

Uses:
1. Undo functionality
- push: add element
- pop: remove recently added element

2. Symbol checker
3. Function calls

Implementation using singly linked lists.

Methods: push, pop, peek, size, empty, search

*/

        Stack<String> songs = new Stack<>();
        songs.push("Promise"); //push to add item sa stack
        songs.push("Same Page");
        songs.push("Just Friends?");
        songs.push("Our Song");
        songs.push("Stop Waiting");

        songs.pop(); // to remove top layer of stack (yung last item na inadd - Stop Waiting)
        System.out.println(songs);
        System.out.println(songs.peek()); // returns top layer onli
        System.out.println(songs.empty()); // edi kung empty ba yung stack
        System.out.println(songs.search("BBLABLABLA")); // if wala sa stack, -1 ang return

        System.out.println(songs.search("Just Friends?"));
        // if nasa stack, ung index from top layer ung return (pero start sa 1)

        Stack<Integer> birthyear = new Stack<>();
        birthyear.push(2007);
        birthyear.push(1995);
        birthyear.push(2000);
        birthyear.push(2006);
        birthyear.push(1997);

        System.out.println(birthyear.size()); // size ng stack

        for (Integer i : birthyear) {
            System.out.println(i);
        }

    }
}
