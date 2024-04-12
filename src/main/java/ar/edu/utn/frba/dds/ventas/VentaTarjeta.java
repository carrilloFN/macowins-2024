package ar.edu.utn.frba.dds.ventas;

public class VentaTarjeta extends Venta{
  private int cuotas;
  private double coeficienteTarjeta = 1.0;

  public VentaTarjeta(int cuotas) {
    super();
    this.cuotas = cuotas;
  }

  /**
   * Aplica un recargo segun la cantidad de cuotas definidas a la sumatoria de los precios
   * @return
   */
  @Override
  public double recargo(double subtotal){
    return (cuotas * coeficienteTarjeta)+(subtotal*0.01);
  }

}
