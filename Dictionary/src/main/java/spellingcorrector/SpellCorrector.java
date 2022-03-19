
package spellingcorrector;

/**
 *
 * @author yiannis
 */
public class SpellCorrector {
 public static void main(String[] args){
     if (args.length == 0){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                SpellFrame app = new SpellFrame();
                app.setVisible(true);
            }
    });
    }else {
       if (args.length != 1){
           System.out.pritnln("You must enter a signle word to check");
           return;
       }  
       
       String word = args[0];
       Dictionary dict = new Dictionary();
       
       if (dict.containdsWord(word)){
           System.out.println("\"" + word + "\" is in the dictionary ");
       } else {
           System.out.pritnln("\"" + word + "\" is not in the dictionary");
           
           System.out.println("Alternatives: ");
           for (String atlternative : dict.findMathces(word, "Levenshtein")){
               System.out.println("  -  " +  alternative);
           }
       }
     }
  }
}
