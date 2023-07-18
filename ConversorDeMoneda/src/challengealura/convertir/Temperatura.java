package challengealura.convertir;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Temperatura extends Conversor implements Unidad {

    public void transformar(String convertir, double valorTemperatura) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        if (convertir != null) {
            switch (convertir) {
                case "De Celsius a Fahrennheit":
                    JOptionPane.showMessageDialog(null, "Es " + decimalFormat.format((valorTemperatura * 1.8) + 32) + " Fahrennheit");
                    break;
                case "De Celsius a Kelvin":
                    JOptionPane.showMessageDialog(null, "Es " + decimalFormat.format(valorTemperatura + 273.15) + " Kelvin");
                    break;
                case "De Fahrennheit a Celsius":
                    JOptionPane.showMessageDialog(null, "Es " + decimalFormat.format((valorTemperatura - 32) / 1.8) + " Celsius");
                    break;
                case "De Fahrennheit a Kelvin":
                    JOptionPane.showMessageDialog(null, "Es " + decimalFormat.format((valorTemperatura - 32) * 1.8 + 273.15) + " Kelvin");
                    break;
                case "De Kelvin a Celsius":
                    JOptionPane.showMessageDialog(null, "Es " + decimalFormat.format(valorTemperatura - 273.15) + " Celsius");
                    break;
                case "De Kelvin a Fahrennheit":
                    JOptionPane.showMessageDialog(null, "Es " + decimalFormat.format((valorTemperatura - 273.15) * 1.8 + 32) + " Fahrennheit");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Proceso cancelado");
        }
    }

    public String conversorMenu() {
        String mensaje, titulo;
        mensaje = "Elije la temperatura qué quieras convertir";
        titulo = "Temperatura";
        super.mensajeMenu = mensaje;
        super.tituloMenu = titulo;

        Object[] opciones = {
            "De Celsius a Fahrennheit",
            "De Celsius a Kelvin",
            "De Fahrennheit a Celsius",
            "De Fahrennheit a Kelvin",
            "De Kelvin a Celsius",
            "De Kelvin a Fahrennheit"};
        super.opciones = opciones;
        return super.conversorMenu();
    }

    public void verificar() {
        String mensaje;
        mensaje = "Ingresa la temperatura";
        super.mensajeIngresar = mensaje;

        super.verificar();
    }

    public void proceso() {
        super.proceso();
    }

}
