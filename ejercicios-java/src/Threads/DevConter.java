package Threads;

class Counter implements Runnable{
	private int valor;
	public Counter (int Valor) {
		this.valor = valor;
	}
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i>=0; i++ ) {
			System.out.printf("Valor %d", Thread.currentThread().getName(), i);
			try {
			Thread.sleep(1000);}
			catch(InterruptedException e ){
				}
			}
		}
		
}
public class DevConter {
	public static void main(String[] args) {
		Thread hilo1=new Thread(new Counter(10), "Hilo1");
		hilo1.start();
		System.out.println("Se lanzaron los hilos");
		Thread hilo2=new Thread(new Counter(20), "Hilo2");
		hilo2.start();
		System.out.println("Fin del Programa");

		hilo.join();
	}		
	}
//una vez que yo ejecuto un hilo, que se muere, ya no se puede ejecutar: pregunta importante


// revisar clase 143 errores en el codigo