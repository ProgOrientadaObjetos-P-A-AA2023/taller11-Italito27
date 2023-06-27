package paquete01;

/**
 *
 * @author tobyc
 */
public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicialMenu,
            double vHelado, double vPastel) {
        super(nombrePlato, valorInicialMenu);
        valorHelado = vHelado;
        valorPastel = vPastel;
    }

    public void establecerValorHelado(double vHelado) {
        valorHelado = vHelado;
    }

    public void establecerValorPastel(double vPastel) {
        valorPastel = vPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nMenú de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tValor Helado: $%.2f\n"
                + "\tValor Pastel: $%.2f\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorHelado,
                valorPastel,
                valorMenu);
        return cadena;
    }
}
