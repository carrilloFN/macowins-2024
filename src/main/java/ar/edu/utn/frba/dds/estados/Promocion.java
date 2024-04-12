package ar.edu.utn.frba.dds.estados;

public class Promocion implements Estado {
  private final int descuentoFijo;

  public Promocion(int descuentoFijo){
    this.descuentoFijo = descuentoFijo;
  }

  /**
   * Le resta un valor fijo definido por el usuario al precio de la prenda
   * @param precio
   * @return
   */
  @Override
  public double precio(double precio) {
    return precio - descuentoFijo;
  }
}
