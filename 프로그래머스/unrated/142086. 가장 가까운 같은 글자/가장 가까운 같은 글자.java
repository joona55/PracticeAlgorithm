import java.util.*;

class Solution {
    public int[] solution(String s) {
        Scanner sc = new Scanner(System.in);
        int[] answer = {};
        char[] ch = new char[s.length()];
        
        answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if(i == 0) {
                answer[i] = -1;
            }
            else {
                for(int j = i - 1; j >= 0; j--) {
                    int dis = -1;
                    if(ch[i] == ch[j]) {
                        dis = i - j;
                        answer[i] = dis;
                        break;
                    }
                }
                if(answer[i] == 0)
                    answer[i] = -1;
            }
        }
        
        return answer;
    }
}