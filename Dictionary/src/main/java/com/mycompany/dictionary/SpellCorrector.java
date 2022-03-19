
package com.mycompany.dictionary;

/**
 *
 * @author yiannis
 */
public class SpellCorrector {
    public static void main (String[] args){
        if (args.length != 1) {
            System.out.println("You must enter a single word to check.");
            return;
        }
    Stirng word = args[0];
    Dictionary dist = new Dictionary();
    
    if (dist.containsWord (word)){
        System.out.println("\"" + word + "\" is in the dictionary");
    } else {
        System.out.println("\"" + word + "\" is not in the dictionary");
    }
    }
}
