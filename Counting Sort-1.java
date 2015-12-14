##Challenge 
##Given a list of integers, can you count and output the number of times each value appears?
##Hint: There is no need to sort the data, you just need to count it.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] count = new int[100];
        
        for(int i = 0; i < arr.length; i ++){
            arr[i] = in.nextInt();
                count[arr[i]]++;
        }
        
        for(int i = 0; i < arr.length; i ++){
                System.out.print(count[i] + " ");
        }  
    }
}
