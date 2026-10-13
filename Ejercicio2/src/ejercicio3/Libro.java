/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author AYRTHON VIVANCO
 */
public class Libro {
    //Atributos
    String titulo,autor, estado;
    int paginas;

    public Libro(String titulo, String autor, String estado, int páginas, int numero_libros) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "Disponible";
        this.paginas = paginas;
    }
    public Libro() {
    }
    
    //Métodos
    public void prestar(){
        if(this.estado.equalsIgnoreCase("Disponible")){
            this.estado="Prestado";
            System.out.println("El libro ha sido prestado con exito");
        }else{
            System.out.println("El libro no se encuentra disponible");
        }
    }
    public void devolver(){
        if(this.estado.equalsIgnoreCase("disponible")){
            estado="Disponible";
            System.out.println("El libro ya ha sido devuelto");
        }else if (this.estado.equalsIgnoreCase("disponible")){
            System.out.println("El libro ya esta disponible");
        }else{
            System.out.println("No se puede devolver el libro");
        }
    }
    public void mostrarInfo(){
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Paginas: " +paginas);
        System.out.println("Estado actual: " +estado);
    }
    
}
