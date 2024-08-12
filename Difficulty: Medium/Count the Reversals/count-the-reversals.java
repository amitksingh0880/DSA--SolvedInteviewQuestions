//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        int length = s.length();
        
        if(length%2 != 0){
            return -1;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < length ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '{'){
                stack.push(ch);
            }
            else{
                if(!stack.empty() && stack.peek()== '{'){
                     stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        int cb =0 ;
        int ob = 0;
        
        while(!stack.isEmpty()){
            if(stack.pop()== '{'){
                ob++;
            }
            else{
                 cb++;
            }
        }
         return (int) (Math.ceil(ob / 2.0) + Math.ceil(cb / 2.0));
    }
}