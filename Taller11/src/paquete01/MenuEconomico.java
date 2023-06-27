package paquete01;

/**
 *
 * @author tobyc
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato,  double valorInicialMenu, double porDescu) {
        super(nombrePlato, valorInicialMenu);
        porcentajeDescuento = porDescu;
    }

    public void establecerPorcentajeDescuento(double pDescuento) {
        porcentajeDescuento = pDescuento;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * (porcentajeDescuento / 100));
    }

  @Override
    public String toString() {
        String cadena = String.format("\nMenú Económico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicual: $%.2f\n"
                + "\tPorcentaje Descuento: %.2f%%\n"
                + "\tValor Menú: $%.2f\n",
                nombrePlato,
                valorInicialMenu,
                porcentajeDescuento,
                valorMenu);
        return cadena;
    }
}
