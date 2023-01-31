import java.util.ArrayList;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 30/01/2023
 * Sección: 40
 * Clase que instancia la calculadora y realiza todas sus funciones
 */

public abstract class CalculadoraPostFix implements ICalculadoraPostFix{

    private Stack <Integer> stack;

    public CalculadoraPostFix(Stack stack){
        this.stack = stack;
    }

    public CalculadoraPostFix(){
        this.stack = new Stack();
    }


}