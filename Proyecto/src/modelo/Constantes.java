package modelo;

public class Constantes
{
    enum Estado_Mozo
    {
        ACTIVO, FRANCO, AUSENTE;    
    }
    
    enum Estado_Mesa
    {
        LIBRE, OCUPADO;
    };
    
    enum Estado_Producto
    {
        ACTIVO, DISCONTINUADO;
    };
    
    enum Forma_Pago
    {
        EFECTIVO, TARJETA, MERCADOPAGOS, CUENTADNI;
    };
    
    enum Estado_Comanda
    {
        ABIERTA, CERRADA;
    };
    
    enum Dias_Promo
    {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }
}
