import javax.swing.*;
import java.awt.*;

public class Ex6 extends JFrame {
    public Ex6(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);

        // Painel esquerdo
        JPanel esquerda = new JPanel();
        esquerda.add(new JLabel("Esquerda"));
        esquerda.setBackground(Color.RED);

        // Painel direito
        JPanel direita = new JPanel();
        JLabel labelDireita = new JLabel("Direita");
        labelDireita.setForeground(Color.WHITE);
        direita.add(labelDireita);
        direita.setBackground(Color.BLUE);

        // SplitPane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, esquerda, direita);
        splitPane.setDividerSize(10);

        add(splitPane);

        setVisible(true);
        splitPane.setDividerLocation(0.4);
        /*
         * O método setDividerLocation define a localização da divisão entre os dois painéis do 
         * JSplitPane de acordo com o valor passado como parâmetro. No caso, foi passado o valor 0.4, o 
         * que significa que ele irá dividir a 40% da largura da janela.
         */
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex6());
    }
}
