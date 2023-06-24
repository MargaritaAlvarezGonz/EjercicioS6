package ProducerConsumers;

import java.util.LinkedList;

public class MargaritaResource {
	private LinkedList<Integer>resources = new LinkedList<>();
	
	public int consume() {
		return resources.poll();
	}
	public void produce(int value) {
		resources.offer(value);
	}
}
