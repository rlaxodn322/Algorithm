import java.util.HashSet;
import java.util.Set;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        
        for(char c : skip.toCharArray()){
            skipSet.add(c);
        }
        
        for(char c : s.toCharArray()){
            char newChar = c;
            for (int i = 0; i < index; i++) {
                newChar++;
                if(newChar>'z') newChar = 'a';
                while(skipSet.contains(newChar)){
                    newChar++;
                    if(newChar>'z') newChar='a';
                }
            }
            sb.append(newChar);
        }
        return sb.toString();
    }
}