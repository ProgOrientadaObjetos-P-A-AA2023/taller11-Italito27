package paquete01;

/**
 *
 * @author tobyc
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu,
            double vPostre, double vBebida) {
        super(nombrePlato, valorInicialMenu);
        valorPostre = vPostre;
        valorBebida = vBebida;
    }

    public void establecerValorPostre(double vPostre) {
        valorPostre = vPostre;
    }

    public void establecerValorBebida(double vBebida) {
        valorBebida = vBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nMenú del Día:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tValor Bebida: $%.2f\n"
                + "\tValor Postre: $%.2f\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
}
