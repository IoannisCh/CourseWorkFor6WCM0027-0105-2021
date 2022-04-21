import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class Main implements ActionListener {
     public Main(ActionListener ActionListener){
       
       JFrame frame = new JFrame();
       
       JButton button = new JButton("Register");
       button.addActionListener(this);
       
       
       JLabel label = new JLabel("New Student");
      
       JPanel panel = new JPanel();
       panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
       panel.setLayout(new GridLayout());
       panel.add(button);
       panel.add(label);
       
       frame.add(panel, BorderLayout.CENTER);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("PTC");
       frame.pack();
       frame.setVisible(true);
    } 
}

