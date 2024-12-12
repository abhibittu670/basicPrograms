package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> queue = new LinkedList<>();
        
        //offer is used to add elements in the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(23);
        System.out.println(queue);
        //return first element of the queue
        System.out.println("return head " + queue.element());
        System.out.println(queue.poll());
        
	}

}
