package negocio;

import java.util.List;

import modelo.Cliente;
import modelo.Mesa;
import modelo.Mozo;
import modelo.Producto;
import modelo.ResumenDiario;


public class BeerHouse
{
	private static BeerHouse instance;

	private List<Cliente> clientes;
	private List<Mozo> mozos;
	private List<Mesa> idMesas;
	private List<Producto> productos;
	private String promocion = "NINGUNA";

	public static BeerHouse getInstance()
	{
		return instance;
	}

	private BeerHouse()
	{
	}

	public String getPromocion()
	{
		return promocion;
	}

	public void setPromocion(String promocion)
	{
		this.promocion = promocion;
	}

	public void agregaMozo(Mozo mozo)
	{
	}

	public void eliminaMozo(Mozo mozo)
	{
	}

	public void agregaCliente(Cliente cliente)
	{
	}

	public void eliminaCliente(Cliente cliente)
	{
	}

	public void agregaMesa(Mesa mesa)
	{
	}

	public void eliminaMesa(Mesa mesa)
	{
	}

	public void agregaProducto(Producto producto)
	{
	}

	public void eliminaProducto(Producto producto)
	{
	}

	public Mesa ocuparMesa(Mozo mozo, int numeroMesa)
	{
		return null;
	}

	public double cerrarMesa(int numeroMesa, Cliente cliente)
	{
		return 0;
	}

	public double deshabilitarMesa(int numeroMesa)
	{
		return 0;
	}

	public void abrirLocal(List<Integer> mesas)
	{
	}

	public void cerrarLocal()
	{
	}

	public List<Mozo> getMozos()
	{
		return mozos;
	}

	public List<Mesa> getMesas()
	{
		return null;
	}

	public List<Producto> getProductos()
	{
		return productos;
	}

	public Mozo mozoMasMesasAtendidas()
	{
		return null;
	}

	public Mozo mayorVolumenVentas()
	{
		return null;
	}

	public List<Cliente> getClientes()
	{
		return clientes;
	}

	public List<ResumenDiario> historico()
	{
		return null;
	}

}
