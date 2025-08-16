import java.awt.*;
import javax.swing.*;

public class Ex2 extends JFrame{
    public Ex2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        
        // TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Painel de configurações
        JPanel config = new JPanel();
        config.add(new JLabel("Bem-vindo às Configurações!"));
        tabbedPane.addTab("Configurações",config);

        // Painel de perfil
        JPanel perfil = new JPanel();
        perfil.setBackground(Color.BLUE);
        JLabel label = new JLabel("Digite o seu nome");
        label.setForeground(Color.WHITE);
        perfil.add(label);
        Icon icon = UIManager.getIcon("OptionPane.informationIcon");
        perfil.add(new JTextField(10));
        tabbedPane.addTab("Perfil",icon,perfil);

        // Painel de ajuda
        JPanel ajuda = new JPanel();
        ajuda.add(new JTextArea("Digite suas dúvidas aqui",30,30));
        tabbedPane.addTab("Ajuda",ajuda);

        // Adicionando o TabbedPane no frame
        add(tabbedPane);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex2());
    }
}
