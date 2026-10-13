/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author AYRTHON VIVANCO
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int op;
        Vehiculo vehiculos[] = null;
        System.out.print("Cuantos vehiculos desea matricular: ");
        int n = sc.nextInt();
        sc.nextLine();
        do{
            System.out.println("==SISTEMA DE MATRICULACION VEHICULAR==");
            System.out.println("1. Ingresar Vehiculos");
            System.out.println("2. Revision Vehicular");
            System.out.println("3. Matricular");
            System.out.println("4. Mostrar Datos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op=sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    vehiculos= new Vehiculo[n];
                    //Vehiculo[] motos = new Vehiculo[n];
                
                    for (int i = 0; i < n; i++) {
                        System.out.print("Datos del vehiculo N" + (i+1) +": ");
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Estado: ");
                        String estado = sc.nextLine();
                        System.out.print("Anio de Fabricacion: ");
                        int anio = sc.nextInt();
                        sc.nextLine();
                        vehiculos[i]=new Vehiculo(marca, modelo, estado, anio);
        }
                case 2:
                    for (int i = 0; i < n; i++) {
                        vehiculos[i].revisionVehicular();
                    }
                    break;
                case 3:
                    for (int i = 0; i < n; i++) {
                       vehiculos[i].matricular(); 
                    }
                    break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        vehiculos[i].mostrarDatos();
                    }
                    break;
                case 5:break;
                default:
                    System.out.println("Opcion no valida !!"); break;
                    
            }
        }while(op!=5);
        sc.close();
    }
    
}
