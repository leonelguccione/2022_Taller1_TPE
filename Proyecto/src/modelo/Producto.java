package modelo;

/**Reglas de Negocio:
el precio de venta no puede ser menor al costo
el precio de costo y venta debe ser > 0
el producto no puede eliminarse si está asociado a una comanda. Usar eliminación lógica.

 */
public class Producto
{
    private int id_producto;
    private String nombre;
    private double precioVenta;
    private double precioCosto;
    private int stock_inicial;
    private Constantes.Estado_Producto estado_producto = Constantes.Estado_Producto.ACTIVO;


}
