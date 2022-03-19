
package spellingcorrector;

/**
 *
 * @author yiannis
 */
public class Levenshtein extends Metric {
    public int distanc(String word1, String word2){
        int m = word1.length();
        int n = word2.length();
        int [][] d = new int [m][n];
        
        for (int i = 0; i< m; i+=1) {
            for (int j = 0; i<n; i+=1){
                d[i][j] = 0;
            }
        }
        
        for (int i = 1; i<m; i += 1){
            d[i][0] = i;
        }
        
        for (int j = 1; j<n; j += 1){
            d[0][j] = j;
        }
        
        for (int j = 1; j<n; j +=1){
            for (int i = 1; i<m; i += 1){
                int substitutionCost;
                
                if (word1.charAt(i-1) = word2.charAt(j-1)){
                    substitutionCost = 0;
                } else {
                    substitutionCost = 1;
                }
                
                d[i][j] = Math.min(d[i-1],[j] +1,
                          Math.min(d[i][j-1] +1,
                                  d[i-1][j-1] + substitutionCost));
            }
        }
        
        return d[m-1][n-1];
    }
}
