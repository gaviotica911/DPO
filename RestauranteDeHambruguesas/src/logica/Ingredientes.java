package logica;

public class Ingredientes 
{
	//Atributos
	private String nombre;
	private int costoAdicional;
	
	//Método Constructor
	public Ingredientes(String nombre, int costoAdicional) 
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	
	//Métodos
	public String getNombre() {
		return nombre;
	}
	
	public int getCostoAdicional() {
		return costoAdicional;
	}
	
		

}
