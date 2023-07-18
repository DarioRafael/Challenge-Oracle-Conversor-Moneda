package challengealura.convertir;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Moneda extends Conversor implements Unidad {

    public void transformar(String convertir, double valorMoneda) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        double dolar = 0.060;
        double euro = 0.053;
        double libra = 0.046;
        double yen = 8.28;
        double won = 75.77;

        if (convertir != null) {
            switch (convertir) {
                case "De Pesos Mexicanos a Dolar":
                    JOptionPane.showMessageDialog(null, "Tienes $ " + decimalFormat.format(valorMoneda * dolar) + " Dolares");
                    break;
                case "De Pesos Mexicanos a Euro":
                    JOptionPane.showMessageDialog(null, "Tienes $ " + decimalFormat.format(valorMoneda * euro) + " Euros");
                    break;
                case "De Pesos Mexicanos a Libras Esterlinas":
                    JOptionPane.showMessageDialog(null, "Tienes $ " + decimalFormat.format(valorMoneda * libra) + " Libras");
                    break;
                case "De Pesos Mexicanos a Yen Japonés":
                    JOptionPane.showMessageDialog(null, "Tienes $ " + decimalFormat.format(valorMoneda * yen) + " Yenes");
                    break;
                case "De Pesos Mexicanos a Won sul-coreano":
                    JOptionPane.showMessageDialog(null, "Tienes $ " + decimalFormat.format(valorMoneda * won) + " Wones");
                    break;
                case "De Dolar a Pesos Mexicanos":
                    JOptionPane.showMessageDialog(null, "Tienes " + decimalFormat.format(valorMoneda / dolar) + " Pesos Mexicanos");
                    break;
                case "De Euro a Pesos Mexicanos":
                    JOptionPane.showMessageDialog(null, "Tienes " + decimalFormat.format(valorMoneda / euro) + " Pesos Mexicanos");
                    break;
                case "De Libras Esterlinas a Pesos Mexicanos":
                    JOptionPane.showMessageDialog(null, "Tienes " + decimalFormat.format(valorMoneda / libra) + " Pesos Mexicanos");
                    break;
                case "De Yen Japonés a Pesos Mexicanos":
                    JOptionPane.showMessageDialog(null, "Tienes " + decimalFormat.format(valorMoneda / yen) + " Pesos Mexicanos");
                    break;
                case "De Won sul-coreano a Pesos Mexicanos":
                    JOptionPane.showMessageDialog(null, "Tienes " + decimalFormat.format(valorMoneda / won) + " Pesos Mexicanos");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Proceso cancelado");
        }
    }

    public String conversorMenu() {
        String mensaje, titulo;
        mensaje = "Elije la moneda a la que deseas convertir tu dinero ";
        titulo = "Moneda";
        super.mensajeMenu = mensaje;
        super.tituloMenu = titulo;

        Object[] opciones = {
            "De Pesos Mexicanos a Dolar",
            "De Pesos Mexicanos a Euro",
            "De Pesos Mexicanos a Libras Esterlinas",
            "De Pesos Mexicanos a Yen Japonés",
            "De Pesos Mexicanos a Won sul-coreano",
            "De Dolar a Pesos Mexicanos",
            "De Euro a Pesos Mexicanos",
            "De Libras Esterlinas a Pesos Mexicanos",
            "De Yen Japonés a Pesos Mexicanos",
            "De Won sul-coreano a Pesos Mexicanos"};

        super.opciones = opciones;
        return super.conversorMenu();
        
    }

    public void verificar() {
        String mensaje;
        mensaje = "Ingresa la cantidad de dinero que deseas convertir";
        super.mensajeIngresar = mensaje;

        super.verificar();
    }

    public void proceso() {
        super.proceso();
    }

}
