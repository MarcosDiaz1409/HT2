import java.util.ArrayList;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 30/01/2023
 * Sección: 40
 * Clase que instancia la calculadora y realiza todas sus funciones
 */

public class CalculadoraPostFix implements ICalculadoraPostFix{

    private Stack <Integer> pila;

    // Constructor e instanciador de la calculadora
    public CalculadoraPostFix(Stack pila){
        this.pila = pila;
    }

    public CalculadoraPostFix(){
        this.pila = new Stack();
    }

    /**
     * Metodo para hacer los procedimientos de la calculadora de suma, resta, multiplicacion y division
     * @param postfix_expression
     * @return
     * @throws Exception
     */
    @Override
    public int Calculate(ArrayList postfix_expression) throws Exception{
        ArrayList<String> elementos = postfix_expression;
        int res = 0;
        int num1 = 0;
        int num2 = 0;

        //Ciclo for que verifica cada elemento del ArrayList para realizar las operaciones indicadas
        for(String elemento : elementos){
            //  Aqui se compara cada elemento del String para verificar que numero es
            if(elemento.equals("0")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("1")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("2")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("3")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("4")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("5")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("6")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("7")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("8")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            else if(elemento.equals("9")){
                int num = Integer.parseInt(elemento);
                pila.push(num);
            }
            // Desde aca comienzan las operaciones segun el operado que este en la secuencia
            else if(elemento.equals("+")){
                if(pila.count() > 1){
                    res = pila.pull() + pila.pull();
                    pila.push(res);
                }
                else if(pila.count() == 1){
                    System.out.println("No hay suficientes operandos para realizar la operacion");
                }
            }
            else if(elemento.equals("-")){
                if(pila.count() > 1){
                    res = pila.pull() - pila.pull();
                    pila.push(res);
                }
                else if(pila.count() == 1){
                    System.out.println("No hay suficientes operandos para realizar la operacion");
                }
            }
            else if(elemento.equals("*")){
                if(pila.count() > 1){
                    res = pila.pull() * pila.pull();
                    pila.push(res);
                }
                else if(pila.count() == 1){
                    System.out.println("No hay suficientes operandos para realizar la operacion");
                }
            }
            else if(elemento.equals("/")){
                if(pila.count() > 1){
                    num1 = pila.pull();
                    num2 = pila.pull();
                    if(num1 != 0){
                        res = num2 / num1;
                        pila.push(res);
                    }
                    else if(num1 == 0){
                        System.out.println("Operacion no valida, resultado indefinido");
                    }
                }
                else if(pila.count() == 1){
                    System.out.println("No hay suficientes operandos para realizar la operacion");
                } 
            }
        }
        return res;
    };
}