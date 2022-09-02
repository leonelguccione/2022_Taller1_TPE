package modelo;

public class Pedido
{
private Producto producto;
private int cantidad;




public Pedido(Producto producto, int cantidad)
{
	super();
	this.producto = producto;
	this.cantidad = cantidad;
}
public Producto getProducto()
{
	return producto;
}
public int getCantidad()
{
	return cantidad;
}


public double getPrecio() 
{
return 0;	
}

}
