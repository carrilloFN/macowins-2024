package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.estados.Estado;

public class Prenda {

  private final double precioBase;
  private Estado estado;
  private final Tipo tipo;

  public Prenda(double precio, Estado estado, Tipo tipo) {
    this.precioBase = precio;
    this.estado = estado;
    this.tipo = tipo;
  }

  public void setEstado(Estado nuevoEstado) {
    this.estado = nuevoEstado;
  }

  /**
   * Calcula el precio de la prenda segun su estado
   *
   * @return
   */
  public double precio() {
    return estado.precio(precioBase);
  }

}
