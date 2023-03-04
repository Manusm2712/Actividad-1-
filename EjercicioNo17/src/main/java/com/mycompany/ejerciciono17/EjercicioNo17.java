//EJERCICIO NUMERO 17 (CIRCUNFERENCIA Y RADIO DE UN CIRCULO)
package com.mycompany.ejerciciono17;
//importamos la clase Scanner para poder introducir informacion
import java.util.Scanner;

/**
 *
 * @author maria
 */
//Creamos la clase EjercicioNo17
public class EjercicioNo17 {

    public static void main(String[] args) {
        double rad, c, a;//asignamos nuestras variables con el tipo de dato "double"
        
        System.out.println("Por favor ingrese el radio del círculo: ");
        Scanner entrada = new Scanner(System.in);//nueva entrada
        
        rad = entrada.nextDouble();//Asignamos a la variable rad el valor ingresado en la respectiva entrada
        c = 2*rad*Math.PI;//utilizamos Math.PI para poner el valor exacto de pi en el programa
        a = Math.PI*Math.pow(rad, 2);//utilizamos Math.pow para elevar un numero a la n potencia
       
        System.out.println("El área del círculo es: "+a);//imprimimos en pantalla los resultados
        System.out.println("La circunferencia del círculo es: "+c);
    }
}
