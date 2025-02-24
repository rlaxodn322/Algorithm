public class Solution {
    public int solution(int n, int m, int[] selection) {
        int cnt = 0;
        int current = 0;
        for (int i = 0; i < selection.length; i++) {
            if (selection[i] > current) {
                cnt++;
                current = (selection[i] + m - 1);
            }
        }
        return cnt;
    }
}
