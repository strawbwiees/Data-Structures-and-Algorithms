import java.util.LinkedList;
import java.util.Queue;

class DSA_Queues {
    static void main(String[] args) {
// collection designed for holding elements prior to processing
// linear DS
        
        Queue<String> customers = new LinkedList<>(); // FIFO - first in first out
            customers.offer("Noella");
            customers.offer("Nanon");
            customers.offer("Ohm");
            customers.poll(); // remove first element - Noella

            System.out.println(customers);
            System.out.println(customers.peek()); //Shows first item
            System.out.println(customers.isEmpty()); // if empty
            System.out.println(customers.size()); // size of queue
            System.out.println(customers.contains("Noella")); //check if element exists


    }
}
