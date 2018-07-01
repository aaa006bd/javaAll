package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Abdullah Al Amin on 7/1/2018.
 */
public class Frequency {
    public static void main(String[] args) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        String values= "abbbaaacccaddadsasduvaa";
        int v;

        for (char c:
             values.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }

        Set<Character> keySet=frequencyMap.keySet();
        TreeSet<Character> sorted= new TreeSet<>(keySet);

        for (Character t:
             sorted) {
            System.out.printf("%c: %d",t,frequencyMap.get(t));
        }
    }
}
