package modelo;

public abstract class Producto
{
	private String nombre;
	private double precioVenta;
	private double precioCosto;
	private boolean enPromocion=false;
	private double descuento=0;
	public Producto(String nombre, double precioVenta, double precioCosto)
	{
		super();
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioCosto = precioCosto;
	}
	public String getNombre()
	{
		return nombre;
	}
	
	public double getPrecioVenta()
	{
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta)
	{
		this.precioVenta = precioVenta;
	}
	public double getPrecioCosto()
	{
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto)
	{
		this.precioCosto = precioCosto;
	}
	public boolean isEnPromocion()
	{
		return enPromocion;
	}
	public void setEnPromocion(boolean enPromocion)
	{
		this.enPromocion = enPromocion;
	}
	public double getDescuento()
	{
		return descuento;
	}
	public void setDescuento(double descuento)
	{
		this.descuento = descuento;
	}
	
	
}
