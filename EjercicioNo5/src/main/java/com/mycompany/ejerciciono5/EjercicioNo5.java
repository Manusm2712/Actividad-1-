//EJERCICIO RESUELTO NUMERO 5 (PRUEBA DE ESCRITORIO)
package com.mycompany.ejerciciono5;
//importamos la clase Scanner para poder introducir informacion
import java.util.Scanner;
/**
 *
 * @author maria
 */
//Creamos la clase EjercicioNo5
public class EjercicioNo5 {

    public static void main(String[] args) {
        int suma=0, x, y;//asignamos nuestras variables con el tipo de dato "int"
        Scanner sc = new Scanner(System.in);//Nueva entrada
        
        System.out.println("Por favor ingrese el valor de x:");
        x = sc.nextInt();//Asignamos a x el valor ingresado en la respectiva entrada
        
        System.out.println("Por favor ingrese el valor de y:");
        y = sc.nextInt();//Asignamos a y el valor ingresado en la respectiva entrada
        
        suma = suma+x;//realizamos las operaciones a nuestras variables
        x = (int) (x+ Math.pow(y, 2));//utilizamos Math.pow para elevar un numero a la n potencia
        suma = suma + (x/y);
        
        System.out.println("EL VALOR DE LA SUMA ES: "+suma); //imprimimos en pantalla el resultado
    }
}
