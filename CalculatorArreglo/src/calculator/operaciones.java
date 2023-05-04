
package calculator;

import java.util.Scanner;
import static calculator.Calculator.num1;
import static calculator.Calculator.num2;
import static calculator.Calculator.resultados;
import static java.lang.Math.sqrt;
public class operaciones {

    public static void leerDatos(){
        Scanner leerNum = new Scanner(System.in);
        num1 = leerNum.nextDouble();
        resultados[0]=num1;
System.out.println("Su numero es "+num1);
Scanner leerNum2 = new Scanner(System.in);
        num2 = leerNum2.nextDouble();
System.out.println("Su numero es "+num2);
resultados[1]=num2;
        
    }
    public static void suma(double num1, double num2){
double resulsuma = num1+num2;
resultados[2]=resulsuma;
}
public static void resta(double num1, double num2){
double resulresta =  num1-num2;
resultados[3]=resulresta;
}

public static void multiplicar(double num1, double num2){
double resulmultiplicacion =  num1*num2;
resultados[4]=resulmultiplicacion;
}

public static void dividir(double num1, double num2){
double resuldivision =  num1/num2;
resultados[5]=resuldivision;
}
public static void modulo(double num1, double num2){
double resulmodulo =  num1%num2;
resultados[6]=resulmodulo;
}
public static void raiz(double num1, double num2){
double resulraiz =  sqrt(num1+num2);
resultados[7]=resulraiz;
}
public static void exponente(double num1, double num2){
double resulexponente =  Math.pow(num1,num2);
resultados[8]=resulexponente;
}
public static void resultado(){
    for (int i=0;i<8;i++){
        System.out.println(resultados[i]);
       
    }
}
}
