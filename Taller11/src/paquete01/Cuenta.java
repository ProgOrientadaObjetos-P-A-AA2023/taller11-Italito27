package paquete01;

import java.util.ArrayList;

/**
 *
 * @author tobyc
 */
public class Cuenta {

    private String nombreCliente;
    private double iva;
    private ArrayList<Menu> menus;
    private double subtotal;
    private double valorTotal;

   public Cuenta(String n, ArrayList<Menu> menu, double i) {
        nombreCliente = n;
        menus = menu;
        iva = i;
    }

    public void establecerNombreClinete(String n) {
        nombreCliente = n;
    }

    public void establecerListaMenu(ArrayList<Menu> i) {
        menus = i;
    }

    public void calcularSubtotal() {
        double suma = 0;

        for (int i = 0; i < menus.size(); i++) {
            suma = suma + menus.get(i).obtenerValorMenu();
        }

        subtotal = suma;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public void calcularValorTotal() {
        valorTotal = subtotal + (subtotal * (iva / 100));
    }

    public String obtenerNombreClinete() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return menus;
    }

    public double obtenerSubTotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura :\nCliente: %s\n", 
                nombreCliente);

        for (int i = 0; i < menus.size(); i++) {
            cadena = String.format("%s%s", 
                    cadena, menus.get(i));
        }

        cadena = String.format("%s\nSubtotal: $%.2f\nIva: %.2f%%\nTotal a Pagar: $%.2f",
                cadena, subtotal, iva * 100, valorTotal);

        return cadena;
    }
}
