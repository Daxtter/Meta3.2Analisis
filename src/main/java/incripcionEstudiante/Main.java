/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incripcionEstudiante;

import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDeClases listaDeClases = new ListaDeClases();
        String clase;
        String nombreP;
        String nombreA;
        String  matricula;
        String codigoClase;
        Scanner lectura = new Scanner(System.in);
        //Actualiza formato
        while(true){
            System.out.println("Ingresa nombre clase");
            clase = lectura.nextLine();
            System.out.println("Ingresa codigo de la clase");
            codigoClase = lectura.nextLine();
            System.out.println("Ingresa nombre del profesor");
            nombreP = lectura.next();
            System.out.println("Ingresa su nombre");
            nombreA = lectura.nextLine();
            System.out.println("Ingresa su matricula");
            matricula = lectura.nextLine();
            listaDeClases.inscripcion(new FormatoDeClase(clase, codigoClase, nombreP, nombreA, matricula));
            
        }
    }
    
}
