import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImcCalculator extends JFrame implements ActionListener {
    private JTextField pesoTxt;
    private JTextField alturaTxt;
    private JButton calcularBtn;
    private JLabel resultadoLbl;

    public ImcCalculator() {
        super("Calculadora de IMC");

        // Creamos los componentes de la interfaz
        JLabel pesoLbl = new JLabel("Peso (kg):");
        JLabel alturaLbl = new JLabel("Altura (m):");
        pesoTxt = new JTextField(20);
        alturaTxt = new JTextField(20);
        calcularBtn = new JButton("Calcular");
        resultadoLbl = new JLabel("");

        // Configuramos el layout de la interfaz
        setLayout(new GridLayout(4, 2));

        // Agregamos los componentes a la interfaz
        add(pesoLbl);
        add(pesoTxt);
        add(alturaLbl);
        add(alturaTxt);
        add(new JLabel());
        add(calcularBtn);
        add(new JLabel("Tu IMC es:"));
        add(resultadoLbl);

        // Configuramos el botón para que escuche eventos de click
        calcularBtn.addActionListener(this);

        // Configuramos la ventana
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtenemos los valores ingresados en los campos de texto
        double peso = Double.parseDouble(pesoTxt.getText());
        double altura = Double.parseDouble(alturaTxt.getText());

        // Calculamos el índice de masa corporal (IMC)
        double imc = peso / (altura * altura);

        // Mostramos el resultado en la etiqueta correspondiente
        resultadoLbl.setText(String.format("%.2f", imc));
    }

    public static void main(String[] args) {
        new ImcCalculator();
    }
}
