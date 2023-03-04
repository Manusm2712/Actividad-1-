//EJERCICIO RESUELTO NUMERO 12 (TRABAJADOR SALARIO BRUTO, RETENCION Y SALARIO NETO)
package com.mycompany.ejerciciono12;
//importamos la clase Scanner para poder introducir informacion
import java.util.Scanner;
/**
 *
 * @author maria
 */
//Creamos la clase EjercicioNo12
public class EjercicioNo12 {

    public static void main(String[] args) {
        int horas, pagohora, salbruto, retencion;//asignamos nuestras variables con el tipo de dato "int"
        Scanner sc = new Scanner(System.in);//Nueva entrada
        
        System.out.println("Por favor ingrese las horas de trabajo: ");
        horas = sc.nextInt();//Asignamos a la variable horas el valor ingresado en la respectiva entrada
        
        System.out.println("Por favor ingrese el pago por hora: ");
        pagohora = sc.nextInt();//Asignamos a la variable pagohora el valor ingresado en la respectiva entrada
        
        salbruto = horas*pagohora;//realizamos las operaciones a nuestras variables
        retencion = (salbruto*25)/200;
      
        System.out.println("El salario bruto del trabajador es: "+salbruto);//imprimos en pantalla los resultados
        System.out.println("La retención en la fuente es: "+retencion);
        System.out.println("El salario neto del trabajador es: "+(salbruto-retencion));
    }
}
