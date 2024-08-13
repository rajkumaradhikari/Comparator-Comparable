import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortString {
    public static void main(String[] args){

        // Comparator to sort strings by their length
       Comparator<String> comp = new Comparator<String>(){
           public int compare(String o1, String o2){
               return Integer.compare(o1.length(),o2.length());
           }
       };

        List<String> words = new ArrayList<>();

        words.add("banana");
        words.add("apple");
        words.add("kiwi");
        words.add("strawberry");
        words.add("pear");
        words.add("orange");

        Collections.sort(words, comp);

        System.out.println(words);
    }
}
