import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        Map<Character, Integer> freqA = new HashMap<>();
        Map<Character, Integer> freqB = new HashMap<>();
        
        for(int i = 0; i<=A.length()-1; i+=1) {
            char chA = A.charAt(i);
            chA = Character.toLowerCase(chA);
            
            if (freqA.containsKey(chA)) {
                freqA.put(chA, freqA.get(chA) + 1);
            } else {
                freqA.put(chA, 1);
            }
        }
        
        for(int j = 0; j <= B.length()-1; j+=1) {
            char chB = B.charAt(j);
            chB = Character.toLowerCase(chB);
            
            if (freqB.containsKey(chB)) {
                freqB.put(chB, freqB.get(chB) + 1);
            } else {
                freqB.put(chB, 1);
            }
            
        }
        
        if(freqA.equals(freqB)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    
    }
}
