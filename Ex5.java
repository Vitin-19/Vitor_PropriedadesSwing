import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ex5 extends JFrame{
    public Ex5(){
        super("Escolha o seu gênero");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);

        // Painel
        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        //RadioButtons
        JRadioButton masc = new JRadioButton("Masculino");
        JRadioButton fem = new JRadioButton("Feminino");
        JRadioButton outro = new JRadioButton("Outro");

        //Configurando RadioButtons
        masc.setActionCommand("Masculino");
        fem.setActionCommand("Feminino");
        outro.setActionCommand("Outro");

        // ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(masc);
        buttonGroup.add(fem);
        buttonGroup.add(outro);

        // Label
        JLabel result = new JLabel();

        // Botão
        JButton botao = new JButton("Selecionar");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                result.setText(buttonGroup.getSelection().getActionCommand());
            }
        });

        //Panel de resultados
        JPanel painelResults = new JPanel();
        painelResults.add(new JLabel("Gênero: "));
        painelResults.add(result);

        // Adicionando os componentes
        painel.add(masc);
        painel.add(fem);
        painel.add(outro);
        painel.add(botao);
        painel.add(painelResults);
        add(painel);
        
        

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex5());
    }
}
