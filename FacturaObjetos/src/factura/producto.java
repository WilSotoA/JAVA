
package factura;

import static factura.Factura.Precio1;
import static factura.Factura.Precio2;
import static factura.Factura.Precio3;
import static factura.Factura.totalfactura;
import static factura.Factura.totaliva;
import java.util.Scanner;

public class producto {
public static void leerDatos(){
 Scanner leerNum = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio del Arroz");
Precio1 = leerNum.nextDouble();
System.out.println("Su numero es "+Precio1);
Scanner leerNum2 = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio de la leche");
Precio2 = leerNum2.nextDouble();
System.out.println("Su numero es "+Precio2);
Scanner leerNum3 = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio del Azucar");
Precio3 = leerNum3.nextDouble();
System.out.println("Su numero es "+Precio3);
}
    public static void calcularIva(String Prod, double Precio){
double Iva=Precio*0.19;
System.out.println(Iva);
totaliva=Iva+totaliva;
totalfactura=Precio+totalfactura;
}

public static void TotalFactura(){
System.out.println("totalFactura  "+totalfactura+"  total iva  "+  totaliva);
}
}
