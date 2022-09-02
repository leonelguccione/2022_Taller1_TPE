package modelo;

public class Cerveza extends Producto
{
	private String tipo;
	private String color;
	private double gradosAlcohol;
	private int unidad_IBU;
	

	public Cerveza(String nombre, double precioVenta, double precioCosto, String tipo, String color, double gradosAlcohol, int unidad_IBU)
	{
		super(nombre, precioVenta, precioCosto);
	}


	public String getTipo()
	{
		return tipo;
	}


	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}


	public String getColor()
	{
		return color;
	}


	public void setColor(String color)
	{
		this.color = color;
	}


	public double getGradosAlcohol()
	{
		return gradosAlcohol;
	}


	public void setGradosAlcohol(double gradosAlcohol)
	{
		this.gradosAlcohol = gradosAlcohol;
	}


	public int getUnidad_IBU()
	{
		return unidad_IBU;
	}


	public void setUnidad_IBU(int unidad_IBU)
	{
		this.unidad_IBU = unidad_IBU;
	}

}
