package factura;


public class Factura {

public static double totaliva=0;
public static double totalfactura=0;

    public static void main(String[] args) {
calcularIva1("Arroz",4000);
calcularIva2("Leche",3000);
calcularIva3("Azucar",3500);
TotalFactura();
    }
    public static void calcularIva1(String Prod1, double Precio1){
double Iva1=Precio1*0.19;
System.out.println(Iva1);
totaliva=Iva1+totaliva;
totalfactura=Precio1+totalfactura;
}
public static void calcularIva2(String Prod2, double Precio2){
double Iva2=Precio2*0.19;
System.out.println(Iva2);
totaliva=Iva2+totaliva;
totalfactura=Precio2+totalfactura;
}
public static void calcularIva3(String Prod3, double Precio3){
double Iva3=Precio3*0.19;
System.out.println(Iva3);
totaliva=Iva3+totaliva;
totalfactura=Precio3+totalfactura;
}
public static void TotalFactura(){
System.out.println("totalFactura  "+totalfactura+"  total iva  "+  totaliva);
}
}