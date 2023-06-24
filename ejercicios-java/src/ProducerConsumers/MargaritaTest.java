package ProducerConsumers;

public class MargaritaTest {
	public static void main(String[] args) {
		MargaritaResource resource = new MargaritaResource();
		
		MargaritaConsumer consumer1 = new MargaritaConsumer (resource, "Consumer1");
		MargaritaConsumer consumer2 = new MargaritaConsumer (resource, "Consumer1");
		
		MargaritaConsumer producer1 = new MargaritaConsumer (resource, "Producer1");
		MargaritaConsumer producer1 = new MargaritaConsumer (resource, "Producer1");
		
		producer1.start();
		producer1.start();
		consumer1.start();
		consumer1.start();
	}

}

//errores en el código. repasar el contenido 14
