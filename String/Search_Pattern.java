/*------------------------Search Pattern----------------------- 
    Input: 
    text = "birthdayboy"
    pattern = "birth"
    Output: 
    [1]
    Explanation: 
    The string "birth" occurs at index 1 in text.
*/
import java.util.ArrayList;

public class Search_Pattern {
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<=text.length()-pattern.length();i++){
            if(pattern.equals(text.substring(i,i+pattern.length()))){
                list.add(i+1);
            }
        }
        return (list);
    }
}
