package paquete01;

/**
 *
 * @author tobyc
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nomPlato,  double vIMenu) {
        nombrePlato = nomPlato;
        
        valorInicialMenu = vIMenu;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorMenu(double vMenu) {
        valorMenu = vMenu;
    }

    public void establecerValorInicialMenu(double vIMenu) {
        valorInicialMenu = vIMenu;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    
    public abstract void calcularValorMenu();
}
