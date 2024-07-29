/*---------------------------Longest Prefix Suffix-------------------------
    Input: s = "abab"
    Output: 2
    Explanation: "ab" is the longest proper 
    prefix and suffix. 
 */

public class Longest_PrefixSuffix {
    int lps(String s) {
        int length = s.length();
        int lps[]=new int[length];//array to store the LPS values
        lps[0]=0;
        int i=1;
        int len=0;
        
        while(i<length){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];//Set len to the previous LPS value
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps[length-1];
    }
}
