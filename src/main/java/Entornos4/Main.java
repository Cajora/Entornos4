
package Entornos4;

/**
 *
 * @author Carlos Lopez
 */
public class Main {

  public static void main(String[] args) {

        eCesta cesta;

        cesta = new eCesta("Apellidos del alumno",100, "dni del alumno", 10);

        NuevoMetodo(cesta); 

    }

    public static void NuevoMetodo(eCesta cesta) {
        try
            
        {
            
            cesta.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }

        try

        {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }
        
        
         try {

                    System.out.println(" Modificación 1");

                     cesta.ActualizarBono(-50);

                 } catch (Exception e) {

                           System.out.print("Fallo…….");

                            }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  "+ bonoactual );
    }
    }

