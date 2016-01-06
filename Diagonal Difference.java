##Problem Statement

##Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

##Input Format

##The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line 
##containing N space-separated integers describing the columns.

##Output Format

##Print the absolute difference between the two sums of the matrix's diagonals as a single integer.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                a[i][j] = in.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 0; i < n; i++){
            sum1 = sum1 + a[i][i];
        }
        
        int j = 0;
        for(int i = n-1; i >= 0; i--){
            sum2 = sum2 + a[j][i];
            j++;
        }
        
        int result = Math.abs(sum1 - sum2);
        System.out.println(result);
    }
}
