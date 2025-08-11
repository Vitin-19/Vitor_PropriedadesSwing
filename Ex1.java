import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1{
    public static void main(String[] args){

        //Frame
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //Panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setSize(400,400);
        panel.setBorder(BorderFactory.createTitledBorder("Painel de cotrole"));

        //Button
        JButton button = new JButton("Clique aqui");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.YELLOW);
            }
        });

        panel.add(button);
        frame.add(panel);
        
        frame.setVisible(true);
    }
}