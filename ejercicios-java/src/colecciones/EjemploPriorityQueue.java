package colecciones;

import java.util.PriorityQueue;

public class EjemploPriorityQueue {
	public static void main(String[] args) {
		//se puede ocupar add o bien offer
		PriorityQueue<Integer>queue=new PriorityQueue<>();
		queue.add(1000);
		queue.add(200);
		queue.add(5);
		queue.add(100);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		
	}

}
