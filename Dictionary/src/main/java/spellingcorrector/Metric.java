
package spellingcorrector;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yiannis
 */
public abstract class Metric {
    
    public static final String[] names = {"Levenshtein"};
    
    public static Metric get (String name){
        if (name.equals("Levenshtein")){
            return new Levenshtein();
        }
        return null;
    }
    
    public abstract int distance(String word1, String word2);
    
    public List<String> findMatches(String word1, List<String> dictionary){
        List<String> result = new ArrayList<>();
        int bestSoFar = word.length() + 1;
        
        for(String testWord: dictionary){
            int d = distance(word, testWord);
            
            if (d < bestSoFar){
                result.clear();
                bestSoFar = d;
                result.add(testWord);
            } else if (d == bestSoFar){
                result.add(testWord);
            }
        }
        
        return result;
    }
}
