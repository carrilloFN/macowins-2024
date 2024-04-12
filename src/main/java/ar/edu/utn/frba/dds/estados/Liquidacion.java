package ar.edu.utn.frba.dds.estados;

/**
 * Implementacion de Estado.
 */
public class Liquidacion implements Estado {
  private final double descuento = 0.5;

  /**
   * Aplica un descuento fijo definido en la clase al precio de la prenda.
   *
   * @param precio
   * @return
   */
  @Override
  public double precio(double precio) {
    return precio * (1 - descuento);
  }

}
