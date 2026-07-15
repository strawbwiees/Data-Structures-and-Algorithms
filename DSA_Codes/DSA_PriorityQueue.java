
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DSA_PriorityQueue {
    static void main (String[] args) {
// FIFO DS that serves elements with the highest priority first b4 elements with lower prio
// sort based on priority
        
       Queue<Integer> grades = new PriorityQueue<>();
       grades.offer(95);
       grades.offer(100);
       grades.offer(98);
       grades.offer(97);
       grades.offer(88);

       while (!grades.isEmpty()) { // while grades is not empty, poll grades and display
           System.out.println(grades.poll()); // naka-arrange lowest to highest
           // if normal queue, arranged kung paano naka-add
       }

       Queue<Integer> grades2 = new PriorityQueue<>(Collections.reverseOrder()); //naka-reverse highest to lowest
       grades2.offer(95);
       grades2.offer(100);
       grades2.offer(98);
       grades2.offer(97);

       while (!grades2.isEmpty()) {
           System.out.println(grades2.poll());
       }

    }
}
