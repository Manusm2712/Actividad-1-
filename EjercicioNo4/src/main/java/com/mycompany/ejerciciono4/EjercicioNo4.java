//EJERCICIO RESUELTO NUMERO 4 (EDAD JUAN, ALBERTO, ANA Y MAMA)
package com.mycompany.ejerciciono4;
//importamos la clase Scanner para poder introducir informacion
import java.util.Scanner;

public class EjercicioNo4 {

    public static void main(String[] args) {
        int edjuan, edana, edalber; // asignamos nuestras variables con el tipo de dato "int" 
        
        System.out.println("Dígite la edad de Juan");//Mostramos en pantalla el texto
        Scanner entrada = new Scanner(System.in);//Nueva entrada
        
        edjuan = entrada.nextInt();//Asignamos a edjuan el valor ingresado en la entrada
        edalber = (2*edjuan)/3;//aplicamos a nuestars variables las operaciones
        edana = (4*edjuan)/3;
        
        System.out.println("La edad de Juan es: "+edjuan);//imprimimos en pantalla los resultados
        System.out.println("La edad de Alberto es: "+edalber);
        System.out.println("La edad de Ana es: "+edana);
        System.out.println("La edad de la madre es: "+(edalber+edana+edjuan));
    }
}
