import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class jradio {
private static JFrame frame = new JFrame("Example");
static String pieString = "pie";
static String iceString = "ice";
static String cakeString = "cake";
public static void main(String[] args) {
// JRadioButton code
final JLabel piclabel
= new JLabel(new ImageIcon( pieString + ".jpg"));
/** Listens to the radio buttons. */
class RadioListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
// getting the event causes update on Jlabel icon
piclabel.setIcon(
new ImageIcon( e.getActionCommand()+".jpg"));
}
}
JRadioButton pieButton = new JRadioButton(pieString);
pieButton.setMnemonic('b');
pieButton.setActionCommand(pieString);
pieButton.setSelected(true);

JRadioButton cakeButton = new JRadioButton(cakeString);
JRadioButton iceButton = new JRadioButton(iceString);
// Group the radio buttons.
ButtonGroup group = new ButtonGroup();
group.add(pieButton);
group.add(cakeButton);
group.add(iceButton);
// Register a listener for the radio buttons.
RadioListener myListener = new RadioListener();
pieButton.addActionListener((java.awt.event.ActionListener) myListener);
cakeButton.addActionListener((java.awt.event.ActionListener) myListener);
iceButton.addActionListener((java.awt.event.ActionListener) myListener);

// Put the radio buttons in a column in a panel to line up
JPanel radioPanel = new JPanel();
radioPanel.setLayout(new GridLayout(0, 1));
radioPanel.add(pieButton);
radioPanel.add(cakeButton);
radioPanel.add(iceButton);
        getFrame().getContentPane().add(radioPanel);
        getFrame().getContentPane().add(piclabel);
        getFrame().setVisible(true);
        getFrame().setSize(400,100);
        getFrame().setDefaultCloseOperation(getFrame().EXIT_ON_CLOSE);
        getFrame().getContentPane().setLayout( new FlowLayout() );
        getFrame().getContentPane().add( radioPanel );
        getFrame().pack(); // size the frame to fit its contents
        getFrame().setVisible(true);
}

    /**
     * @return the frame
     */
    public static JFrame getFrame() {
        return frame;
    }

    /**
     * @param aFrame the frame to set
     */
    public static void setFrame(JFrame aFrame) {
        frame = aFrame;
    }
}