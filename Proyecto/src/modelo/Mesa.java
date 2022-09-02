package modelo;

import java.util.List;

/**Reglas de negocio que sirven para el contrato
 * 
 los nro de mesa no pueden repetirse.
 el nro de mesa 0 referencia a la BARRA
 la cantidad de comensales debe ser > =2 cuando el nro de mesa es > 1
 */
public class Mesa
{
    enum Estado
    {
        LIBRE, OCUPADO;
    }
    private int id_mesa;

    /**cantidad de comensales, cuantas sillas acepta
     */
    private int capacidad; 
    private Estado estado = Estado.LIBRE;
    private Mozo mozo_asignado;
    
    //TODO: hacer todos los métodos necesarios
}