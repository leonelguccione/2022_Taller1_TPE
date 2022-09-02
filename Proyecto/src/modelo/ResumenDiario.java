package modelo;

import java.util.GregorianCalendar;

public class ResumenDiario
{

	private GregorianCalendar inicio;
	private GregorianCalendar fin;
	private double ventasDiarias;
	private int mesasAtendidas;

	public ResumenDiario(GregorianCalendar inicio, GregorianCalendar fin, double ventasDiarias, int mesasAtendidas)
	{
		super();
		this.inicio = inicio;
		this.fin = fin;
		this.ventasDiarias = ventasDiarias;
		this.mesasAtendidas = mesasAtendidas;
	}

	public double getVentasDiarias()
	{
		return ventasDiarias;
	}

	public GregorianCalendar getInicio()
	{
		return inicio;
	}

	public GregorianCalendar getFin()
	{
		return fin;
	}

	public int getMesasAtendidas()
	{
		return mesasAtendidas;
	}

}
