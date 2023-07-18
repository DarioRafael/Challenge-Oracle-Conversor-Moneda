package challengealura.convertir;

import javax.swing.JOptionPane;

//Clase padre
public class Conversor {

    protected int opcion = JOptionPane.YES_OPTION;
    protected boolean continuar = true;
    protected double cantidad = 0;
    protected Object[] opciones;
    protected String mensajeMenu, tituloMenu, mensajeIngresar;
    private String menuOpcion;

    public void transformar(String convertir, double valor) {
    }

    public String conversorMenu() {
        // this.opciones = opciones;

        return (String) JOptionPane.showInputDialog(null, mensajeMenu, tituloMenu,
                JOptionPane.PLAIN_MESSAGE, null, this.opciones, "Selecciona");
    }

    public void verificar() {
        String datoIngresado = null;

        while (continuar) {
            datoIngresado = JOptionPane.showInputDialog(mensajeIngresar);
            if (datoIngresado == null) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Quiere cancelar la conversion actual?");
                if (respuesta == JOptionPane.YES_OPTION) {
                    opcion = JOptionPane.NO_OPTION;
                    inicio();
                } else {
                    continuar = true;
                }

            } else {
                try {
                    cantidad = Double.parseDouble(datoIngresado);
                    continuar = false;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Valor no valido");
                    continuar = true;
                }
            }
        }
        String convertir = conversorMenu();
        transformar(convertir, cantidad);

        opcion = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
        if (opcion == JOptionPane.YES_OPTION) {
            continuar = true;
        } else if (opcion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        } else if (opcion == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        }

    }

    public void proceso() {
        do {
            verificar();
        } while (opcion == JOptionPane.YES_OPTION);
    }

    //Metodos propios
    public void inicio() {
        Moneda moneda = new Moneda();
        Temperatura temperatura = new Temperatura();
        Dato dato = new Dato();
        Masa masa = new Masa();

        menuOpcion = menu();

        if (menuOpcion.equals("Conversor de Moneda")) {
            moneda.proceso();

        } else if (menuOpcion.equals("Conversor de Temperatura")) {
            temperatura.proceso();
        } else if (menuOpcion.equals("Conversor de Datos")) {
            dato.proceso();

        } else if (menuOpcion.equals("Conversor de Masa")) {
            masa.proceso();
        }

    }

    public String menu() {
        Object[] opciones = {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Datos", "Conversor de Masa"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión: ", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opciones, "Selecciona");

        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            System.exit(0);
        }
        return seleccion;

    }

}
