/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_25082025;
import java.util.Scanner; 
/*
Nancy Beatriz Flores Rivera - FR100524
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ingresar_datos();
    }
    public static void ingresar_datos (){
        // Inicializando la clase scanner
        Scanner sc = new Scanner (System.in);
        
        // Declaración de variables
        int [] edades = new int [10];
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //Mensaje al usuario
        System.out.println("Ingrese " + edades.length + " edades:");
        
        // Se recorre el arreglo para asignar valor a cada elemento
            for (int i = 0; i<edades.length; i++){
                
                // Se solicita al usuario el ingreso de un valor
                System.out.println("Edad "+ i +": ");
                
                /* Se lee desde teclado el valor digitado por el usuario
                   y se le asigna a la variable de edad que corresponde
                   según la posición en la iteración
                */
                edades[i] = sc.nextInt();
                
                /* Para calcular el promedio, se requiere sumar todas las
                   edades registradas en cada elemento
                */
                suma += edades[i];
                
                // Establecer si el valor digitado es par o impar
                if ((edades[i] % 2) == 0){
                    /* Es par
                       Se incrementa la variable acumuladora
                    */
                    total_pares++;
                } else{
                    /* Es impar
                       Se incrementa la variable acumuladora
                    */      
                    total_impares++; 
                }
            }
            // Se calcula el promedio de las edades
            double promedio = (double ) suma/edades.length;
            
            // Se imprime la salida
            System.out.println("Usted ha ingresado: "+ edades.length +" edades.");
            System.out.println("El promedio de las edades es: "+ promedio);
            System.out.println("Ingreso: "+ total_pares +" edades pares y "+ total_impares +" edades impares.");
            
            // Se cierra el objeto de tipo scanner porque ya no habrá más lecturas
            sc.close();
    }
    
}
