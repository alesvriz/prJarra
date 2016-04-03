package prJArra;

public class Jarra {

	private int contenido;
	private final int capacidad;
	
	public Jarra (int c){
		capacidad=c;
		contenido=0;
	}
	public int capacidad(){
		return capacidad;
	}
	public int contenido(){
		return contenido;
	}
}
