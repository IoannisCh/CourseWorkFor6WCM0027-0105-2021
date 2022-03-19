package spellingcorrector;

import java.utils.list;
import java.swing.*;
import java.swing.text.*;
import java.awt.*;
import java.awt.event.*;


public class SpellFrame extends JFrame{
    private final JTextPane results;
    private JButton button;
    
    public SpellFrame(){
        super ("Spelling Corrector");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout ());
        results = new JTextPane();
        results.setEditable(false);
        
        add (new JLabel ("Top bar test"), BorderLayout.NORTH);
        add (new JScrollPane (reults));
        getRootPane().setDefaultButton(button);
        
        setSize (400,200);
    }
    
    private JPanel createTopBar() {
        JPanel panel = new JPanel();
        JTextField field = new JTextField(20);
        JComboBox metrics = new JComboBox (Metric.names);
        
        button = new JBitton("Check");
        button.addActionListener(new ClickListener(field, results, metrics));
        
        panel.setLayOut(new BorderLayout());
        panel.add(new JLabel("WordL "), BorderLayout.WEST);
        panel.add(field);
        panel.add(button, BorderLayOut.EAST);
        panel.add(metrics, BorderLayout.SOUTH);
        
        return panel;
    }
}

class ClickListener implements ActionListener {
    private final Dictionary dist;
    private final JTextField searchWord;
    private final JTextPane results;
    private final JComboBox metrics;
    
    ClickListener(JTextField searchWord, JTextPane results, JComboBox metrics){
        this.searchWord = searchWord;
        this.results = results;
        this.metrics = metrics;
        dict = new Dictionary();
    }
    
    public void ationRerformed(ActionEvent e){
        Document doc = results.getDocument();
        String word = searchWord.getText();
        searchWord.setText("");
        
        try {
            doc.remove(0, doc.getLength());
            
            if (dict.containsWord(word)){
                doc.insertString(0, "\"" + word + "\" is in the dictionary", null);
            } else {
                doc.insertString(0, "\"" + word + "\" is not in the dictionary", null);
                
                doc.insertString(doc.getLength(), "\n\nAlternatives:", null);
                AltsWorker worker - new AltsWorker(doc, dict, word, (String)metrics.getSelectedItem());
                worker.execute();
            }
        } catch (BadLocationException b){
            ;
        }
    } 
}

class AltsWorker extends SwingWorker<Void, Void> {
    
    private final Document doc;
    private final Dictionary dict;
    private final String word;
    private final String metricName;
    private List<String> alternatives;
    
    public AltsWorker(Document doc, Dictionary dict, String word, String metricName) {
        this.doc = doc;
        this.dict = dict;
        this.word = word;
        this.metricName = metricName;
    }
    
    public void doInBackground(){
        alternatives = dict.findMatches(word, metricName);
        return null;
    }
    
    public void done(){
        try {
            for (String alternative : alternatives) {
                doc.insertSting(doc.getLength(), "\n - " + alernative, null);
            }
        } catch (BadLocationException b) {
            ;
        }
    }
    
}