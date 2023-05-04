
package calculator;

import java.util.Scanner;
import static calculator.Calculator.num1;
import static calculator.Calculator.num2;
public class operaciones {

    public static void leerDatos(){
        Scanner leerNum = new Scanner(System.in);
        num1 = leerNum.nextDouble();
System.out.println("Su numero es "+num1);
Scanner leerNum2 = new Scanner(System.in);
        num2 = leerNum2.nextDouble();
System.out.println("Su numero es "+num2);
        
    }
    public static void suma(double num1, double num2){
double resulsuma = num1+num2;
System.out.println("la suma entre "+num1+"  y "+num2+" es igual a "+resulsuma);
}
public static void resta(double num1, double num2){
double resulresta =  num1-num2;
System.out.println("la resta entre "+num1+"  y "+num2+" es igual a "+resulresta);
}

public static void multiplicar(double num1, double num2){
double resulmultiplicacion =  num1*num2;
System.out.println("la multiplicación entre "+num1+"  y "+num2+" es igual a "+resulmultiplicacion);
}

public static void dividir(double num1, double num2){
double resuldivision =  num1/num2;
System.out.println("la división entre "+num1+"  y "+num2+" es igual a "+resuldivision);
}
public static void modulo(double num1, double num2){
double resulmodulo =  num1%num2;
System.out.println("el modulo entre "+num1+"  y "+num2+" es igual a "+resulmodulo);
}
}
