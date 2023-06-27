package paquete01;
/**
 *
 * @author tobyc
 */
public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorInicialMenu, 
            double vGuarnicion, double vBebida, 
            double pServicio) {
        super(nombrePlato, valorInicialMenu);
        valorGuarnicion = vGuarnicion;
        valorBebida = vBebida;
        porcentajeServicio = pServicio;
    }

    public void establecerValorGuarnicion(double vGuarnicion) {
        valorGuarnicion = vGuarnicion;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public void establecerValorBebida(double vBebida) {
        valorBebida = vBebida;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerPorcentajeServicio(double pServicio) {
        porcentajeServicio = pServicio;
    }

    public double obtenerPorcentajeServicio() {
        return porcentajeServicio;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorGuarnicion + valorBebida
                + (valorInicialMenu * (porcentajeServicio / 100));
    }

    @Override
    public String toString() {
        return "Menú a la Carta - " + nombrePlato + "\n"
                + "Valor menú: $" + valorMenu + "\n"
                + "Valor inicial menú: $" + valorInicialMenu + "\n"
                + "Valor guarnición: $" + valorGuarnicion + "\n"
                + "Valor bebida: $" + valorBebida + "\n"
                + "Porcentaje servicio: " + porcentajeServicio + "%";
    }
}
