package ar.edu.utn.frba.dds.ventas;

import ar.edu.utn.frba.dds.Item;
import java.util.List;
import java.util.Optional;

public abstract class Venta {
  private List<Item> prendasVendidas;

  /**
   * Calcula la sumatoria del importe de cada prenda
   * @return
   */
  public double subtotal(){
    Optional<Double> importeFinal = prendasVendidas.stream()
        .map(prenda -> prenda.precio())
        .reduce(Double::sum);
    return importeFinal.isPresent() ? importeFinal.get() : 0.0;
  }

  /**
   * Calcula el importe total y final aplicando un recargo
   * @return
   */
  public double total(){
    return recargo(this.subtotal());
  }

  /**
   * Aplica un recargo a un subtotal
   * @param subtotal
   * @return
   */

  public abstract double recargo(double subtotal);

}
