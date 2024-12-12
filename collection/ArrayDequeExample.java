package collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		//insert element
		ad.offer(23);
		//insert element at first
		ad.offerFirst(45);
		//insert element at last
		ad.offerLast(67);
		ad.offer(56);
		System.out.println(ad);
		
		//front element which is about to come out first
		System.out.println(ad.peek());
		
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		//take out the element which is in front
		System.out.println(ad.poll());
		System.out.println("poll() " + ad);
		
		System.out.println(ad.peekFirst());
		System.out.println("peekfirst " + ad);
 
		System.out.println(ad.pollLast());
		System.out.println("polllast " + ad);
	}

}
