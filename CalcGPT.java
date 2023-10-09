
package calcgpt;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGPT {
    public static void main(String[] args) {
        // Crie uma janela JFrame
        JFrame frame = new JFrame("Calculadora de Divisão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        // Centralize o JFrame no meio da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width - frame.getWidth()) / 2;
        int y = (dim.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);

        // Crie rótulos e campos de texto para entrada dos números
        JLabel label1 = new JLabel("Número 1:");
        JTextField numero1TextField = new JTextField();
        JLabel label2 = new JLabel("Número 2:");
        JTextField numero2TextField = new JTextField();

        // Defina um plano de fundo verde muito claro para a janela
        frame.getContentPane().setBackground(new Color(230, 255, 230));

        // Reduza o espaçamento entre os rótulos e as caixas de texto
        label1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        label2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

        // Defina bordas pretas para os campos de texto
        numero1TextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numero2TextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Defina fonte negrito para os rótulos
        Font boldFont = new Font(label1.getFont().getName(), Font.BOLD, label1.getFont().getSize());
        label1.setFont(boldFont);
        label2.setFont(boldFont);

        // Crie um rótulo para exibir o resultado e defina a cor vermelha
        JLabel resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setForeground(Color.RED);

        // Crie um botão para realizar a divisão
        JButton calcularButton = new JButton("Calcular");

        // Adicione os componentes à janela
        frame.add(label1);
        frame.add(numero1TextField);
        frame.add(label2);
        frame.add(numero2TextField);
        frame.add(resultadoLabel);
        frame.add(calcularButton);

        // Adicione um ouvinte de ação ao botão de cálculo
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtenha os números da entrada do usuário
                    double numero1 = Double.parseDouble(numero1TextField.getText());
                    double numero2 = Double.parseDouble(numero2TextField.getText());

                    // Verifique se o segundo número é zero para evitar divisão por zero
                    if (numero2 == 0) {
                        resultadoLabel.setText("Não é possível dividir por zero.");
                    } else {
                        // Realize a divisão e exiba o resultado
                        double resultado = numero1 / numero2;
                        resultadoLabel.setText("Resultado: " + resultado);
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Entrada inválida. Insira números válidos.");
                }
            }
        });

        // Torne a janela visível
        frame.setVisible(true);
    }
}

