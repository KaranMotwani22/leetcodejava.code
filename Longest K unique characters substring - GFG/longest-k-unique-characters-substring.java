//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends

class Solution {
    public int longestkSubstr(String s, int k) {
    int i = 0, j = 0;   
        HashMap<Character, Integer> map1 = new HashMap<>();
        int max = -1;
        
        while(j < s.length()){
            map1.put(s.charAt(j), map1.getOrDefault(s.charAt(j), 0) + 1);
            
            while(map1.size() > k){
                map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) - 1);
            
            
            if(map1.get(s.charAt(i)) == 0){
                map1.remove(s.charAt(i));
            }
            i++;
        }
        
        if(map1.size() == k){
            max = Math.max(max, j - i + 1);
        }
        
        j++;
        
        }
        
        return max;
    }
    
}