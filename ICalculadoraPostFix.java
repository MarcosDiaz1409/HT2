import java.util.ArrayList;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 23/01/2023
 * Sección: 40
 * Inteface que contienen el metodo para hacer las operaciones de la calculadora
 */

public interface ICalculadoraPostFix{

    /**
     * Metodo para hacer los procedimientos de la calculadora de suma, resta, multiplicacion y division
     * @param postfix_expression
     * @return
     * @throws Exception
     */
    public int Calculate(ArrayList postfix_expression) throws Exception;
    // pre: se tiene un arraylist con los elementos
    // post: devuelve el resultado despues de realizar todas las operaciones

}