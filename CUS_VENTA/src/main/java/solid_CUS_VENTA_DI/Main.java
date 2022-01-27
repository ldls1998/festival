package solid_CUS_VENTA_DI;


public class Main {

    public static void main(String[] args) {
        Ventas venta = new Ventas();
        double total = 0;

        venta.registrarVenta(new Boleto("Jose","Perez",78945612,"probando@gmail.com","Chile","Santiago","Boleto tipo A","Explanada","masculino"));
        venta.registrarVenta(new Boleto("Mariana","Balceda",456789123,"probando123@gmail.com","Argentina","Buenos Aires","Boleto tipo B","Sur","femenino"));
      
        System.out.println("---------------------------------");

        Supervisor supervisor = new Supervisor();
        total = supervisor.totalVentas();

        System.out.println("El total de ventas es : " + total);

    
    }
}
