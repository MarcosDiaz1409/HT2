import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 30/01/2023
 * Sección: 40
 * Clase principal, es la clase donde el usuario interactura con el programa
 */

public class CalculadoraPrincipal{
    public static void main(String[] args) {

        // Se crea el ArrayList que almacena todas las lineas del archivo
        ArrayList<String> lineasArchivo = new ArrayList<>();

        // Lee el archivo de texto y agrega todas las lineas al ArrayList anterior
        File file = new File("C:/Ejemplos/ejemplo.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                while(br.ready()) {
                    lineasArchivo.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        CalculadoraPostFix calc = new CalculadoraPostFix();

        // Separa las lineas del archivo para que se operen correctamente
        for(String linea : lineasArchivo){
            ArrayList<String> cdlinea = new ArrayList<>();
            String[] espacio = linea.split("");
            for(String elemento : espacio){
                cdlinea.add(elemento);
            }

            // Realiza el metodo Calculate y devuelve el resultado de cada linea
            try {
                calc = new CalculadoraPostFix();
                System.out.println("El resultado es: " + calc.Calculate(cdlinea));                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Error, revisar el archivo de texto");
            }
        }
    }
}