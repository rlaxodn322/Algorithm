public class Solution {
    public int max = 0;
    public int solution(int k, int[][] dungeons){
        boolean[] bool= new boolean[dungeons.length];
        explore(k, dungeons, bool, 0);
        return max;
    }
    public void explore(int k, int[][] dungeons, boolean[] bool, int cnt){
        max = Math.max(max, cnt);
        for(int i=0; i<dungeons.length; i++){
            if(!bool[i] && k>= dungeons[i][0]){
                bool[i] = true;
                explore(k - dungeons[i][1], dungeons, bool, cnt + 1);
                bool[i] = false;
            }
        }
    }
}
