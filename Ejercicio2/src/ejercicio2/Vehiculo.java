/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author AYRTHON VIVANCO
 */
public class Vehiculo {
    //Atributos
    String marca, modelo, estado;
    int anio_fab;
    boolean matriculado;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, String estado, int anio_fab) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.anio_fab = anio_fab;
        this.matriculado = false;
    }
    //Métodos
    public void revisionVehicular(){
        if(anio_fab <1996){
            estado = "Usado Malo";            
        }else if(anio_fab<2016){
            estado= "Usado Bueno";
        }else if(anio_fab <2026 && estado.equalsIgnoreCase("nuevo")){
            estado= "Semi Nuevo";
        }else{
            estado="Nuevo";
        }
    }
    public void matricular(){
        if(!estado.equalsIgnoreCase("Usado Malo")){
            matriculado=true;
            System.out.println("Vehiculo Matriculado");
        }else{
            System.out.println("No se puede matricular");
        }
    }
    public void mostrarDatos(){
        System.out.println("==DATOS DE MATRICULACION");
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Estado: " +estado);
        System.out.println("Anio: " +anio_fab);
        System.out.println("Matriculado: " +(matriculado ? "Si": "No"));
        
    }
}
