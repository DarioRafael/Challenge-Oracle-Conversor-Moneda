package challengealura.convertir;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Dato extends Conversor implements Unidad {

    public void transformar(String convertir, double valor) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        if (convertir != null) {
            switch (convertir) {
                case "De Bytes a Kilobytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor / 1024) + " kilobytes");
                    break;
                case "De Kilobytes a Bytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor * 1024) + " bytes");
                    break;
                case "De Kilobytes a Megabytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor / 1024) + " megabytes");
                    break;
                case "De Megabytes a Kilobytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor * 1024) + " kilobytes");
                    break;
                case "De Megabytes a Gigabytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor / 1024) + " gigabytes");
                    break;
                case "De Gigabytes a Megabytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor * 1024) + " megabytes");
                    break;
                case "De Gigabytes a Terabytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor / 1024) + " terabytes");
                    break;
                case "De Terabytes a Gigabytes":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valor * 1024) + " gigabytes");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Proceso cancelado");
        }
    }

    public String conversorMenu() {
        String mensaje, titulo;
        mensaje = "Elije el dato al que deseas convertirlo";
        titulo = "Datos";
        super.mensajeMenu = mensaje;
        super.tituloMenu = titulo;

        Object[] opciones = {
            "De Kilobytes a Bytes",
            "De Bytes a Kilobytes",
            "De Megabytes a Kilobytes",
            "De Kilobytes a Megabytes",
            "De Megabytes a Gigabytes",
            "De Gigabytes a Megabytes",
            "De Gigabytes a Terabytes",
            "De Terabytes a Gigabytes"};

        super.opciones = opciones;
        return super.conversorMenu();
    }

    public void verificar() {
        String mensaje;
        mensaje = "Ingrese la cantidad de su dato";
        super.mensajeIngresar = mensaje;

        super.verificar();

    }

    public void proceso() {
        super.proceso();
    }

}
