package ar.edu.utn.frba.dds.ventas;

public class VentaEfectivo extends Venta{

  /**
   * No aplica ningun recargo, retornando el subtotal
   * @return
   */
  @Override
  public double recargo(double subtotal){
    return subtotal;
  }

}
