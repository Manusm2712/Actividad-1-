//EJERCICIO NUMERO 14 (CUBO Y CUADRADO DE UN NUMERO)
package com.mycompany.ejerciciono14;
//importamos la clase Scanner para poder introducir informacion
import java.util.Scanner;

/**
 *
 * @author maria
 */
//Creamos la clase EjercicioNo14
public class EjercicioNo14 {

    public static void main(String[] args) {
        int num, cuad, cub;//asignamos nuestras variables con el tipo de dato "int"
        System.out.println("Por favor ingrese un número a convertir: ");
        Scanner sc = new Scanner(System.in);//Nueva entrada
        num = sc.nextInt();//Asignamos a la variable num el valor ingresado en la respectiva entrada
        
        cuad =  (int) Math.pow(num, 2);//realizamos las operaciones a nuestras variables
        cub =  (int) Math.pow(num, 3);//utilizamos Math.pow para elevar un numero a la n potencia
        
        System.out.println("El cuadrado del numero es: "+cuad);//imprimimos en pantalla los resultados
        System.out.println("El cubo del numero es: "+cub); 
    }
}
