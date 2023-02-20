package logica;

public class ProductoMenu implements Producto
{
	//Atributos
	private String nombre;
	private int precioBase;
	
	
	//Contructor
	public ProductoMenu(String nombre, int precioBase) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	//Método
	public String getNombre() {
		return nombre;
	}


	public int getPrecio() {
		return precioBase;
		
	}
	public String generarTextoFactura()
	{
		return null;
		
	}
	

	
	

}
