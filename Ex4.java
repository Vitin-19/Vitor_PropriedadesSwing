import javax.swing.*;
import javax.swing.text.MaskFormatter;


public class Ex4 extends JFrame{
    public Ex4() throws Exception{
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        
        // JFormattedTextField
        MaskFormatter mask = new MaskFormatter("##/##/####");
        mask.setPlaceholder("_");

        JFormattedTextField dateField = new JFormattedTextField(mask);
        dateField.setColumns(8);

        // Painel principal
        JPanel painel = new JPanel();
        painel.add(dateField);

        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try{
                new Ex4();
            }catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
