/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
public class StringUtils {
   
    public static boolean included(String search, String withinWord) {
        search = search.trim().toLowerCase();
        withinWord = withinWord.trim().toLowerCase();
        
        return withinWord.equals(search);
    }
}
