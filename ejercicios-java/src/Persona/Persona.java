package Persona;

public class Persona {
    
    String  nombre;
    int edad;
    char genero;
    
    Persona(){
    	System.out.println("Constructor por defecto");
    }

   
    Persona(String n, int ed, char g){
    	this();
        this.nombre = n;
        this.edad = ed;
        this.genero = g;
        System.out.println("Esto es un constructor");
    }

    void jugarVideojuelgos(Persona p){
        System.out.println(nombre + " Esta jugando con " + p.nombre);
    }

   
    void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

     
    public static void main(String[] args){
        
        Persona p=new Persona("Alex",32,'M');
        p.imprimirInformacion();
        System.out.println();
        Persona p1=new Persona("Juan", 51, 'M');
        p1.imprimirInformacion();

        p.jugarVideojuelgos(p1);
        

    }
}
