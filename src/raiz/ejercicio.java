package potencia;

import javax.swing.JOptionPane;

public class ejercicio {

    public static void main(String[] args) {
        Potencia();
    }

    public static void Potencia() {
        double a, b, c;
       
        for (int i = 0; i < 5; i++) {
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
            c = Math.pow(a,b);
            if (c >= 100) {
                System.out.println("Es mayor a 100");
            } else {
                System.out.println("c");
                JOptionPane.showMessageDialog(null, "La potencia" + c);
            }
        }

    }
}
