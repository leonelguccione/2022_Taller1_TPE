package modelo;

import java.util.List;

public class Mesa
{
private int numero;
private char estado='L';
private List<Pedido> pedidos;

public Mesa(int numero)
{
	super();
	this.numero = numero;
}


public int getNumero()
{
	return numero;
}


public char getEstado()
{
	return estado;
}

public void deshabilitar()
{
	
}


public void agregarPedido(Pedido nuevoPedido)
{
	}

public void anularPedido(Pedido pedido)
{
	}

public double getTotal(Cliente cliente)
{
	return 0;
}


public double cerrar(Cliente cliente) 
{
return 0;	
}

public void abrir() {}







}
