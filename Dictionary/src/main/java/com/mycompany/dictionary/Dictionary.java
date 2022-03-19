

package com.mycompany.dictionary;

import java.util.Collections;

/**
 *
 * @author yiannis
 */
public class Dictionary {
    private List<String> words;
    
    public Dictionary () {
        words = new ArraList<String> ();
        
        loadWords (Dictionary.class.getResourceAsStream ("resources/dictionary.txt"));
        
        Collections.sort(words);
    }
        
    public boolean containsWord (String word){
        int result = Collections.binarySearch (Words, word);
        
        return result >= 0;
    }

    private void loadWords (InputStream file){
        try {
            BufferdReader br = new BufferedReader(new InputStreamReader (file));
            
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
            words.add(line);
            }
            
        } catch (IOException ex)
    
    }
        
        
}
