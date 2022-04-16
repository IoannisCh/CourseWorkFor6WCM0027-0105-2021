    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTableDemo{
    String [] colHeads = { "Title", "ID", "Loan", "Date", "Artist", "Type"};
    

    private Object [][] data = {
        
       {"Greatest Hits", "1", "true", "020221", "Bon Acord", "cd"},
       {"Iron Maiden", "19", "true", "090221", "Iron Maiden", "cd"},    
       {"British Steel", "20", "true", "120221", "Judas Priest","cd"},
       {"Paranoid", "4", "true", "200221", "Black Sabbath","cd"},
       {"Manowar", "5", "false", "000000", "Manowar", "cd"} 
    };
    
    JFrame jfrm = new JFrame("JTableDemo");
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(500, 500);
    
    JTable table = new JTable(data, colHeads);
    
    private JScrollPane jsp = new JScrollPane(table);
    
    jfrm.add(jsp);
    
    jfrm.setVisible(true);

    /**
     * @return the data
     */
    public Object[][] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object[][] data) {
        this.data = data;
    }

    /**
     * @return the jsp
     */
    public JScrollPane getJsp() {
        return jsp;
    }

    /**
     * @param jsp the jsp to set
     */
    public void setJsp(JScrolPane jsp) {
        this.jsp = jsp;
    }

}

    public static void main(String[] args) {
        SwingUtilities.invokeLater{
            new Runnable(){
                public void run(){
                    new JTableDemo();
                }
            }
    };
     

