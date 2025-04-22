
package gitedt6;
/**
 * Clase Tarea6EDClase que describe el precio de unos productos y los 
 * descuentos según la cantidad de productos
 * @author CPL
 */

public class Tarea6EDClase {
 /**
  * Método que aplica el descuento según la cantidad de productos
  * @param precioProducto
  * @param numProductos 
  */
    
  
  public void aplicarDescuento(double precioProducto, int numProductos){ 
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            totalDescuento1(precioProducto);
        }else {
            totalDescuento2(precioProducto);
        }   
   }  
    
  /**
   * Método que calcula el descuento según un porcentaje constante
   * @Param precioProducto
   */
  
  private static final double DESCUENTO1 = 0.95;
    private void totalDescuento1(double precioProducto) {
        double Total;
        double resultado=precioProducto;
        Total = resultado*DESCUENTO1;
        mostrarTotal(Total);
    }
   
    /**
     * Método que calcula el descuento según otro porcentaje constante
     * @Param precioProducto
     */
    private static final double DESCUENTO2 = 0.8;
    private void totalDescuento2(double precioProducto) {
        double Total;
        Total = precioProducto*DESCUENTO2;
        mostrarTotal(Total);
    }
    
    /**
     * Método para mostrar el precio total de los productos con el descuento aplicado y un mensaje de "Enviado"
     * @param Total 
     */
    public void mostrarTotal(double Total) {
        System.out.println("El total a pagar es:"+Total+"\nEnviado");
        
    }
    
}
