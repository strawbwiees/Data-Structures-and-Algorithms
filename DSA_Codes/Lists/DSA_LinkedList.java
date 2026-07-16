import java.util.LinkedList;

 class DSA_LinkedList {

/* LinkedList - stores Nodes: data + pointer/address, linked using pointers
- Nodes are in non-consecutive memory location
- Searching is o(n)
- Insertion and deletion is o(1)

Singly linked list -
Doubly linked list - has 2 pointers/address for next and previous
*/

    static void main (String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.push("Noella"); // use push/pop to behave as a stack
        names.push("Jimin");
        names.push("Nanon");
        names.push("AJ");
        names.push("Gun");
        names.pop();

        System.out.println(names);

        LinkedList<String> surname = new LinkedList<>();
        surname.offer("Beltran"); // use offer/poll to behave as queue
        surname.offer("Park");
        surname.offer("Kirdpan");
        surname.offer("Jutamas");

        surname.add(4,"Attaphan"); // add new element between elements (index, new element)
        surname.remove(0);
        System.out.println("index of Kirdpan: " + surname.indexOf("Kirdpan"));

        System.out.println(surname);
        System.out.println(surname.peekFirst()); // return head
        System.out.println(surname.peekLast()); // return tail

        surname.addFirst("Beltran"); // new head
        surname.addLast("Pawat"); // new tail
        System.out.println(surname);

        //remove
        surname.removeFirst();
        surname.removeLast();
        System.out.println(surname);

    }
}
