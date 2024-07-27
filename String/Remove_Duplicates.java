/*-----------------------Remove all duplicates from a given string------------------------ 
    Input:
    str = "geEksforGEeks"
    Output: 
    "geEksforG"
    Explanation: 
    After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
*/
public class Remove_Duplicates {
    String removeDuplicates(String str) {
        int i=0;
        String s="";
        while(i<str.length()){
            if(!s.contains(Character.toString(str.charAt(i)))){
                s+=str.charAt(i);
            }
            i++;
        }
        return s;
    }
}
