
package calculator;

import java.util.Scanner;

public class Calculator {
    public static double[]resultados = new double[9];
    public static double num1;
    public static double num2;
    public static void main(String[] args) {
     operaciones calobj = new operaciones();
    calobj.leerDatos();
    calobj.suma(num1,num2);
    calobj.resta(num1,num2);
    calobj.multiplicar(num1,num2);
    calobj.dividir(num1,num2);
    calobj.modulo(num1,num2);
    calobj.raiz(num1,num2);
    calobj.exponente(num1,num2);
    calobj.resultado();
    }

}
