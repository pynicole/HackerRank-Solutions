import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {

        // Write your code here.
        
        Scanner in = new Scanner(System.in);
        Double amount = in.nextDouble();
        
        NumberFormat nf;
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nf.format(amount));
        
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("India: " + nf.format(amount));
        
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf.format(amount));
        
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf.format(amount));
    }
}
