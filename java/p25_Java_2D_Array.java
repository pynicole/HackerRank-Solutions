import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int[][] doubleArray = new int[n][n];
        
        
        for(int i=0; i!=n; i++) {
            for(int j=0; j!=n; j++) {
                doubleArray[i][j] = in.nextInt();
            }
        }
        
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int a=0; a<n-2; a++) {
            for(int b=0; b<n-2; b++) {
                sum = doubleArray[a][b] 
                + doubleArray[a][b+1] 
                + doubleArray[a][b+2] 
                + doubleArray[a+1][b+1] 
                + doubleArray[a+2][b] 
                + doubleArray[a+2][b+1] 
                + doubleArray[a+2][b+2];
                if(sum>maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
