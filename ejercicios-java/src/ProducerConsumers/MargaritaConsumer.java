package ProducerConsumers;

public class MargaritaConsumer {
private MargaritaResource resource;

public MargaritaConsumer(MargaritaResource resource, String name) {
	super (name);
	this.resource =resource;
}

@Overrride
public void run() {
	while (true) {
		try {
		int value = resource.consume();
	}}catch{
	
}
}
}
