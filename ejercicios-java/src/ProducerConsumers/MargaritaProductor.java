package ProducerConsumers;

public class MargaritaProductor extends Thread {
	private MargaritaResource resource;

	public MargaritaProductor(MargaritaResource resource, String name) {
		super();
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				resource.produce(MAX_PRIORITY);
			}catch (InterruptedException e){
				
			}
		}
		
	}
	
	
//Errores revisar clase 151
}
