package logica;

public class Ingredientes 
{
	//Atributos
	private String nombre;
	private int costoAdicional;
	
	//M?todo Constructor
	public Ingredientes(String nombre, int costoAdicional) 
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	
	//M?todos
	public String getNombre() {
		return nombre;
	}
	
	public int getCostoAdicional() {
		return costoAdicional;
	}
	
		

}
