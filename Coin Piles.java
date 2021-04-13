// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1[] = read.readLine().split(" ");
            int N = Integer.parseInt(S1[0]);
            int K = Integer.parseInt(S1[1]);
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.minSteps(A,N,K));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minSteps(int[] A, int N, int k) {
        int small = Integer.MAX_VALUE;
        for (int i = 0 ; i < A.length; i++)
            small = Math.min(small, A[i]);
            
        int ans = 0;
        for (int i = 0 ; i < N ; i ++) {
            int big = A[i];
            if (big - small > k)
                ans = ans + (big-small-k);
        }
        
        return ans;
    }
}