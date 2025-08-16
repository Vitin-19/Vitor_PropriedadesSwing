import javax.swing.*;
import java.awt.*;

public class Ex7 extends JFrame{
    public Ex7(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0,1,20,20));

        // Painel principal
        JPanel panel = new JPanel();


        // ComboBox
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("Brasil");
        comboBox.addItem("Argentina");
        comboBox.addItem("Chile");
        comboBox.setSelectedIndex(2);

        // Label país selecionado
        JLabel paisSelecionado = new JLabel(comboBox.getSelectedItem().toString());

        // evento ao selecionar outro país
        comboBox.addItemListener(event -> {
            if (event.getStateChange() == java.awt.event.ItemEvent.SELECTED){
                paisSelecionado.setText(event.getItem().toString());
            }
        });

        panel.add(comboBox);
        panel.add(paisSelecionado);
        
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex7());
    }
}
