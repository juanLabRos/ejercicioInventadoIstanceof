/*
 El ejercico consiste en decir si una persona de un colegio s profesor, alumno o director.
 Si es conserje o del personal de limpieza, mostrar OTROS.
 */
package ejercicioinventadoistanceof;

import dominio.alumno;
import dominio.persona;
import dominio.profesor;
import dominio.director;
import dominio.otros;
import java.util.ArrayList;

/**
 *
 * @author Juan Labandeira Ros
 */
public class EjercicioInventadoIstanceof {

    //creación ArrayList para acumularlos
	
	private ArrayList ar  = new ArrayList();
    
    
    private void comprobar(Object ob){
	if(ob instanceof persona){
	    System.out.println("La persona "+((persona)ob).getNombre()+" pertenece a la clase "+((persona)ob).getClass());
	}else{
	    System.out.println("La persona "+((otros)ob).getNombre()+" pertenece a otra clase");
	}
    }
    
    public static void main(String[] args) {
	
	System.out.println("Ejercicio istanceof");
	
	//creación ArrayList para acumularlos
	
	ArrayList ar  = new ArrayList();
	//creación alumnos
	alumno a1 = new alumno("Juan","Ros",01);
	alumno a2 = new alumno("Paco","Sainz",02);
	
	//creación profesor
	profesor p1 = new profesor("Begoña","Gómez",01);
	profesor p2 = new profesor("Alonso","Ruiz",02);
	
	//creación del director
	director d1 = new director("Adela","Martínez",01);
	
	//otros puestos
	otros o1 = new otros("Miguel","Hermana",01);
	otros o2 = new otros("Carlos","Azul",02);
	
	ar.add(a1);
	ar.add(a2);
	ar.add(p1);
	ar.add(p2);
	ar.add(d1);
	ar.add(o1);
	ar.add(o2);
	
	EjercicioInventadoIstanceof io = new EjercicioInventadoIstanceof();
	
	io.comprobar(a1);
	io.comprobar(a2);
	io.comprobar(p1);
	io.comprobar(p1);
	io.comprobar(d1);
	io.comprobar(o1);
	io.comprobar(o1);
	
    }
    
}
