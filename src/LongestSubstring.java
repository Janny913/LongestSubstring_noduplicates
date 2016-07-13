import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by jianiyang on 16/7/12.
 */

//return the length of the longest substring
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s){
        Hashtable hash = new Hashtable();

        int max = 0;
        int availablefrom = 0;
        for(int i = 0; i < s.length(); i++){
            if(hash.containsKey(s.charAt(i))){
                int last = (Integer)hash.get(s.charAt(i));
                availablefrom = Math.max(availablefrom, last + 1);
            }
            hash.put(s.charAt(i), i);
            max = Math.max(max, i - availablefrom + 1);
        }
        return max;

    }

    public static void main(String[] args){
        String s = new String("wwwwerrrrk");
        LongestSubstring res = new LongestSubstring();
        int result = res.lengthOfLongestSubstring(s);
        System.out.println(result);
    }

}
