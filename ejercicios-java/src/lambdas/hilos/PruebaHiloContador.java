package lambdas.hilos;

public class PruebaHiloContador {
public static void main(String[] args) {
	Thread hilo = new Thread(new HiloContador());
			hilo.start();
			
			Runnable hilo2 = ()->
			for (int i = 0; i <10; i++);
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch{InterruptedException}{
			e.printStrackTrace()
			}
}
}

//Revisar clase 179
