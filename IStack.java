/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 23/01/2023
 * Sección: 40
 * Interface con todos los metodos que el stack utilizara
 */

public interface IStack<T>{

    /**
     * Metodo para contar cuantos elementos hay en el stack
     */
    int count();

    /**
     * Metodo para verificar si el stack esta vacio
     */
    boolean isEmpty();

    /**
     * Metodo para introducir un valor al stack
     */
    void push(T value);

    /**
     * Metodo para extraer un valor del stack
     */
    T pull();

    /**
     * Metodo para observar el ultimo valor ingresado
     */
    T peek();

}