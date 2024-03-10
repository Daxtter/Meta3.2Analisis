/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package incripcionEstudiante;

import java.util.ArrayList;

/**
 *
 * @author nunez
 */
public class ListaDeClases {
    ArrayList<FormatoDeClase> BaseDeDatosUABC;

    public ListaDeClases() {
        BaseDeDatosUABC = new ArrayList<>();
    }
    public void inscripcion (FormatoDeClase formato){
    
    BaseDeDatosUABC.add(formato);
    }
}
