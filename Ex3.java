import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame{
    public Ex3(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Painel de rolagem principal
        JTextArea textArea = new JTextArea("Java Swing é usado para interfaces gráficas...",10,30);
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        super.add(scrollPane);

        setVisible(true);

        /*
         * O ScrollPane é necessário nesse cenário para permiir que o usuário possa escrever
         * um grande número de linhas e colunas e que possa acessá-las sem exeder o limite do
         * JFrame.
         */
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex3());
    }
}
