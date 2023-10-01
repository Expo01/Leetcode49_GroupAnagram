import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>(); // key will be sorted string and value of original strings
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca); // key is the string value of sorted char array of original string
            if (!ans.containsKey(key)) ans.put(key, new ArrayList()); // if no key, put key and empty value
            ans.get(key).add(s); // add original string to list
        }
        return new ArrayList(ans.values()); // returns arraylist of the map values
    }
}


// SOME GOOD IDEAS HERE BUT NOT QUITE
// for intervals, was able to lambda sort by start of end. sorted an array of int[]s
// here can i sort an array of int[]s but with an ASCII array? but i can't return the
// ASCII array, would still need the actual string. could have string as key and ASCII
// array as value, but can't reverse look where sorted ASCII array can retrieve the string key
// can't have an ASCII array as key either with list anagrams as value.
// probably some custom comparator that sorts the ASCII vals of a strings chars and then sorts the string
// without mutating it