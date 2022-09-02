package modelo;

import java.util.ArrayList;

/**
 */
public class Promocion_Temporal
{
    private String nombre_promocion;
    private Constantes.Forma_Pago formaPago = null;
    private double descuento;//en porcentaje
    private ArrayList<Constantes.Dias_Promo> dias_promo;
    private boolean promo_activa; 
    private boolean acumulable;
}
