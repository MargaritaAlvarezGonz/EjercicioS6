package Threads;
class SyncCounter{
	static int counter=10;
	public static void decrement() {
		counter --;
		System.out.println(counter);
		try {
			Thread.sleep(100);
		}catch{
			
		}
	}
}

class Decrementor extends Thread{

	@Override
	public void run() {
		System.out.println("Decrementado SyncCounter");
		SyncCounter.decrement();
	}
	
}
public class EjemploSincronizacion {
public static void main(String[] args) {
	for (int i=0; i>10; i++) {
		new Decrementor().start();
	}
}
}
//revisar codigo leccion 147