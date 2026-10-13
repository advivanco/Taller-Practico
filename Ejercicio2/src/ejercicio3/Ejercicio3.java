/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author AYRTHON VIVANCO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Cuantos libros deseas ingresar: ");
    int n = sc.nextInt();
    sc.nextLine();

    Libro[] biblioteca = new Libro[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Registro del Libro " + (i + 1) + ":");
        System.out.print("Ingrese el titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = sc.nextLine();

        System.out.print("Ingrese el genero: ");
        String genero = sc.nextLine();

        System.out.print("Ingrese el numero de paginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();

        biblioteca[i] = new Libro(titulo, autor, genero, anio, paginas);
    }

    if (n > 0) {
        System.out.print("Ingrese el numero de libro a prestar (1 al " + n + "): ");
        int indexPrestar = sc.nextInt() - 1;
        sc.nextLine();
        if (indexPrestar >= 0 && indexPrestar < n) {
            biblioteca[indexPrestar].prestar();
        } else {
            System.out.println("Indice no valido.");
        }

        System.out.print("Ingrese el numero de libro a devolver (1 al " + n + "): ");
        int indexDevolver = sc.nextInt() - 1;
        sc.nextLine();
        if (indexDevolver >= 0 && indexDevolver < n) {
            biblioteca[indexDevolver].devolver();
        } else {
            System.out.println("Indice no valido.");
        }

        System.out.println("\n--- LISTA DE LIBROS REGISTRADOS ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Libro N" + (i + 1) + ":");
            biblioteca[i].mostrarInfo();
        }
    }

    sc.close();
}
}