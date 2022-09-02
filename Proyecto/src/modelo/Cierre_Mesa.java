package modelo;

import java.util.Date;

/**Reglas de Negocio
No se puede cerrar una comanda que ya ha sido cerrada
Al grabar la venta la mesa asociada a la comanda debe quedar en estado Libre
Al momento de cerrar la mesa se debe verificar si cumple con alguna promoción

 */
public class Cierre_Mesa
{
   private Date fecha;
   private Mesa mesa;
}
