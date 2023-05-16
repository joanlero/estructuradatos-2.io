
/**
 * Write a description of class CalcularCompra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;
import java.util.Scanner;
public class CalcularCompra
{
    public static void main(String[] args) {
          
    
    Scanner scanner = new Scanner(System.in);
    int numCompras;
    Compra[] lasCompras = new Compra[50];
    String referenciaCompra, nombreProveedor, nitProveedor;
    Date fecha;
    double valorCompra;
    double totalCompra= 0;
    
    
    System.out.println("Ingrese el número de compra que desea registrar");
    numCompras = scanner.nextInt();
    scanner.nextLine();
    
    for (int i = 0; i < numCompras; i++) {
                // Solicitar los datos de la compra
                System.out.println("\nCompra #" + (i + 1));
                                
                
                System.out.println("Ingrese el nit del proveedor: ");
                nitProveedor = scanner.next();
                
                System.out.println("Ingrese el nombre nombre del proveedor: ");
                nombreProveedor = scanner.next();
                
                System.out.println("Ingrese referencia de la compra: ");
                referenciaCompra = scanner.next();
                
                
                System.out.println("Ingrese el valor de la compra: ");
                valorCompra = scanner.nextDouble();
                
                Compra unaCompra = new Compra();
                unaCompra.referenciaCompra = referenciaCompra;
                unaCompra.nombreProveedor = nombreProveedor;
                unaCompra.nitProveedor = nitProveedor;
                unaCompra.valorCompra = valorCompra;
                lasCompras[i] = unaCompra;
            }    
            
            for(int i = 0; i <numCompras; i++){
                double sum =(lasCompras[i].valorCompra);
                totalCompra = totalCompra + sum;
            }
            
            System.out.println("El total de la compra es: $" + totalCompra);
    }
}
