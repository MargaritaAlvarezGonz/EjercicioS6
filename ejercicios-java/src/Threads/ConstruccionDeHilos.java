package Threads;

class Devs4jThread extends Thread{

	public Devs4jThread(String name) {
		super(name);	
	
}
@Override
	public void run() {
	for (int i = 0; i <100; i ++) {

		System.out.println("Esto es una tarea concurrente");
		System.out.printf("Hilo %s indice%d", getName()i);
	}
public class ConstruccionDeHilos {
	public static void main(String[] args) {
		Dev4jThread hilo1=new Dev4jThread ("Hilo 1");
		Dev4jThread hilo2=new Dev4jThread ("Hilo 2");
		
		//hilo1.run();
		//hilo2.run();
		
		hilo1.start();
		hilo2.start();
	}
		
	}

}
//Codigo con errores, ver la clse 142