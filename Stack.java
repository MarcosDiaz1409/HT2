import java.util.ArrayList;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 23/01/2023
 * Sección: 40
 * Clase que instancia y crea un stack para almacenar numeros
 */
public abstract class Stack<T> implements IStack<T>{

    // Creacion de la lista que va a almacenar los valores
    private ArrayList<T> miLista;

    //Constructor de la clase
    public Stack(){
        miLista = new ArrayList<T>();
    }

    // Metodo para contar cuantos elementos hay en el stack
    @Override
	public int count() {
		return miLista.size();
	}

    // Metodo para verificar si el stack esta vacio
	@Override
	public boolean isEmpty() {
		return miLista.isEmpty();
	}

    // Metodo para introducir un valor al stack
	@Override
	public void push(T value) {
		miLista.add(0, value);
	}

    // Metodo para extraer un valor del stack
	@Override
	public T pull() {
		return miLista.remove(0);
	}

    // Metodo para observar el ultimo valor ingresado
	@Override
	public T peek() {		
		return miLista.get(0);
	}


}