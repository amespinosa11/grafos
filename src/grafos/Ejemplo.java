package grafos;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import ejemplo.grafo.Ejemplo1;
import ejemplo.grafoConBFS.Ejemplo2;
import ejemplo.grafoDirigido.Ejemplo3;
import ejemplo.grafoDirigidoConBFS.Ejemplo4;
import ejemplo.grafoDirigidoConPeso.Ejemplo5;

public class Ejemplo {
	
	public static Ejemplo1 grafo = new Ejemplo1();
	
	public static Ejemplo2 grafoBFS = new Ejemplo2();
	
	public static Ejemplo3 grafoDirigido = new Ejemplo3();
	
	public static Ejemplo4 grafoDirigidoBFS = new Ejemplo4();
	
	public static Ejemplo5 grafoDirigidoPeso = new Ejemplo5();
	
	public static void main(String[] args) throws IOException {
		List<String> list = Arrays.asList(args);
		System.out.print(list);
		if (list.contains("Unweighted") && list.contains("Undirected") ) {
			grafo.correr();
		}
		if( list.contains("Unweighted") && list.contains("BFS") && list.contains("Undirected") ) {
			grafoBFS.correr();
		}
		if( list.contains("Weighted") && list.contains("Undirected") ) {
			grafoDirigido.correr();
		}
		if( list.contains("Weighted") && list.contains("Undirected") && list.contains("BFS") ) {
			grafoDirigidoBFS.correr();
		} 
		if(list.contains("Unweighted") && list.contains("Directed")) {
			grafoDirigido.correr();
		}
		if(list.contains("Unweighted") && list.contains("Directed") && list.contains("BFS")) {
			grafoDirigidoBFS.correr();
		}
		if(list.contains("Weighted") && list.contains("Directed") ) {
			grafoDirigidoPeso.correr();
		}
		if(list.contains("Weighted") && list.contains("Directed") && list.contains("BFS")) {
			grafoDirigidoPeso.correr();
		}
	}
}
