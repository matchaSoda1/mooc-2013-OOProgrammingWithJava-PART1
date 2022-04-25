
public class StringUtils {
    
    public static boolean included(String withinWord, String search) {
        //order of parameters is unnatural
        search = search.trim().toLowerCase();
        withinWord = withinWord.trim().toLowerCase();
        
        return withinWord.contains(search);
    }
}
