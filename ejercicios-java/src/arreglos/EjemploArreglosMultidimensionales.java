package arreglos;

public class EjemploArreglosMultidimensionales {
	
	public static void main(String[] args) {
		int arreglo[][]=new int[2][2];
		arreglo[0][0]=20;
		arreglo[0][1]=25;
		arreglo[1][0]=40;
		arreglo[1][1]=45;
		
		for(int i=0;1<arreglo.length;i++) {
			for(int j=0;j <arreglo[i].length;j++) {
				System.out.print(arreglo[i][j]+"\t");
			}
			System.out.println();
			
			
		}
	}

}
