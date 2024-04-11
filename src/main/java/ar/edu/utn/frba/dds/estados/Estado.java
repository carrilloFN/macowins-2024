package ar.edu.utn.frba.dds.estados;

/**
 * Representa la capacidad de aplicar un calculo al precio de una prenda.
 */
public interface Estado {
  /**
   * Aplicara un calculo al precio dado.
   *
   * @param precio Precio de la prenda.
   * @return Retorna un precio nuevo.
   */
  public double precio(double precio);
}
