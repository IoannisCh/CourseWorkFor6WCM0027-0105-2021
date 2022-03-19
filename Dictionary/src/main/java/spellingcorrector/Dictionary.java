

package spellingcorrector;

import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author yiannis
 */
public class Dictionary {
    private List<String> words;
    
    public Dictionary () {
        words = new ArrayList<String>();
        
        loadWords (Dictionary.class.getResourceAsStream ("resources/dictionary.txt"));
        
        Collections.sort(words);
    }
        
    public boolean containsWord(String word){
        int result = Collections.binarySearch (Words, word);
        
        return result >= 0;
    }

    private void loadWords (InputStream file){
        try {
            BufferedReader br = new BufferedReader(new InputStrreamReader (file));
            
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
            words.add(line);
            }
            
        } catch (IOException ex){
            ;
        }
          
    }
        
        
}
