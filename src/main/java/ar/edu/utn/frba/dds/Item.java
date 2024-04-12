package ar.edu.utn.frba.dds;

import java.time.LocalDate;

/**
 * Prenda en factura.
 */
public class Item {
  private final Prenda prenda;
  private final LocalDate fechaVenta;
  private final int cantidad;

  /**
   * Constructor.
   *
   * @param prenda     .
   * @param fechaVenta .
   * @param cantidad   .
   */
  public Item(Prenda prenda, LocalDate fechaVenta, int cantidad) {
    this.prenda = prenda;
    this.fechaVenta = fechaVenta;
    this.cantidad = cantidad;
  }

  /**
   * Retorna el coste total del item.
   */
  public double precio() {
    return prenda.precio() * cantidad;
  }
}
