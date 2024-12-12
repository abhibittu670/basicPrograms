package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(48);
        System.out.println(pq);
        //poll pick the smallest element
        System.out.println(pq.poll());
        System.out.println(pq);
        //next which is about to come i.e24(smallest element
        System.out.println(pq.peek());
        //biggest element
        Queue<Integer> dq = new PriorityQueue<>(Comparator.reverseOrder());
        dq.offer(12);
        dq.offer(24);
        dq.offer(36);
        dq.offer(48);
        System.out.println(dq);
        System.out.println(dq.peek());
	}

}
