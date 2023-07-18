package challengealura.convertir;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Masa extends Conversor implements Unidad {

    public void transformar(String convertir, double valorMasa) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        if (convertir != null) {
            switch (convertir) {
                case "De Gramos a Kilogramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 1000) + " Kilogramos");
                    break;
                case "De Gramos a Libras":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 453.592) + " Libras");
                    break;
                case "De Gramos a Onzas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 28.3495) + " Onzas");
                    break;
                case "De Gramos a Toneladas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 1000000) + " Toneladas");
                    break;
                case "De Kilogramos a Gramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 1000) + " Gramos");
                    break;
                case "De Kilogramos a Libras":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 2.20462) + " Libras");
                    break;
                case "De Kilogramos a Onzas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 35.274) + " Onzas");
                    break;
                case "De Kilogramos a Toneladas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 1000) + " Toneladas");
                    break;
                case "De Libras a Gramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 453.592) + " Gramos");
                    break;
                case "De Libras a Kilogramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 2.20462) + " Kilogramos");
                    break;
                case "De Libras a Onzas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 16) + " Onzas");
                    break;
                case "De Libras a Toneladas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 2204.62) + " Toneladas");
                    break;
                case "De Onzas a Gramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 28.3495) + " Gramos");
                    break;
                case "De Onzas a Kilogramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 35.274) + " Kilogramos");
                    break;
                case "De Onzas a Libras":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 16) + " Libras");
                    break;
                case "De Onzas a Toneladas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa / 35274) + " Toneladas");
                    break;
                case "De Toneladas a Gramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 1000000) + " Gramos");
                    break;
                case "De Toneladas a Kilogramos":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 1000) + " Kilogramos");
                    break;
                case "De Toneladas a Libras":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 2204.62) + " Libras");
                    break;
                case "De Toneladas a Onzas":
                    JOptionPane.showMessageDialog(null, "Son " + decimalFormat.format(valorMasa * 35274) + " Onzas");
                    break;

            }
        } else {
            JOptionPane.showMessageDialog(null, "Proceso cancelado");
        }
    }

    public String conversorMenu() {
        String mensaje, titulo;
        mensaje = "Elije la masa a la que deseas convertir ";
        titulo = "Masa";
        super.mensajeMenu = mensaje;
        super.tituloMenu = titulo;

        Object[] opciones = {
            "De Gramos a Kilogramos",
            "De Gramos a Libras",
            "De Gramos a Onzas",
            "De Gramos a Toneladas",
            "De Kilogramos a Gramos",
            "De Kilogramos a Libras",
            "De Kilogramos a Onzas",
            "De Kilogramos a Toneladas",
            "De Libras a Gramos",
            "De Libras a Kilogramos",
            "De Libras a Onzas",
            "De Libras a Toneladas",
            "De Onzas a Gramos",
            "De Onzas a Kilogramos",
            "De Onzas a Libras",
            "De Onzas a Toneladas",
            "De Toneladas a Gramos",
            "De Toneladas a Kilogramos",
            "De Toneladas a Libras",
            "De Toneladas a Onzas"
        };

        super.opciones = opciones;
        return super.conversorMenu();

    }

    public void verificar() {
        String mensaje;
        mensaje = "Ingresa la cantidad que deseas convertir";
        super.mensajeIngresar = mensaje;

        super.verificar();
    }

    public void proceso() {
        super.proceso();
    }

}
