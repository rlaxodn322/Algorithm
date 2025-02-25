import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> HashRight = new HashMap<>();
        for(int t: topping){
            HashRight.put(t, HashRight.getOrDefault(t, 0) + 1);
        }
        HashSet<Integer> HashLeft = new HashSet<>();
        int cnt = 0;
        for(int t:topping){
            HashLeft.add(t);
            HashRight.put(t, HashRight.get(t) - 1);
            if(HashRight.get(t)==0)HashRight.remove(t);
            if(HashLeft.size()==HashRight.size())cnt++;
        }
        return cnt;
    }

}