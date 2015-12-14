##Problem Statement

##A series is defined in the following manner:

##Given the nth and (n+1)th terms, the (n+2)th can be computed by the following relation 
##Tbase(n+2) = Tbase(n+1)^2 + Tbase(n)

##So, if the first two terms of the series are 0 and 1: 
##the third term = 1^2 + 0 = 1 
##fourth term = 1^2 + 1 = 2 
##fifth term = 2^2 + 1 = 5 
##... And so on.

##Given three integers A, B and N, such that the first two terms of the series (1st and 2nd terms) are A and B respectively, compute the Nth term of the series.



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger f, s;
        f = in.nextBigInteger();
        s = in.nextBigInteger();
        int n = in.nextInt();
        
        BigInteger[] arr = new BigInteger[n];
        arr[0] = f;
        arr[1] = s;
        for(int i = 2; i < n; i ++){
            arr[i] =  (arr[i-1].pow(2)).add(arr[i-2]);  
        }
        System.out.println(arr[n-1]);        
    }
}
