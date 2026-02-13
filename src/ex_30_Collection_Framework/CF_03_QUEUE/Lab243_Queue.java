package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
        q.add("Alice");
        q.add("David");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);


    }
}