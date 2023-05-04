package factura;
import java.util.Scanner;

public class Factura {
public static double Precio1;
public static double Precio2;
public static double Precio3;
public static double totaliva=0;
public static double totalfactura=0;

    public static void main(String[] args) {
producto.leerDatos();
producto ProdObj = new producto();
ProdObj.calcularIva("Arroz", Precio1);            
producto ProdObj2 = new producto();
ProdObj2.calcularIva("Leche", Precio2); 
producto ProdObj3 = new producto();
ProdObj3.calcularIva("Azucar", Precio3);    
producto.TotalFactura();

    }

}