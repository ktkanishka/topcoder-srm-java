package D2L1.SRM589;

public class GooseTattarrattatDiv2 {
    public int getmin(String S){
        int max = 0;
        int[] cnt = new int[26];
        for(int i = 0; i < S.length(); i++){
            int t = (int)(S.toCharArray()[i] - 'a');
            cnt[t]++;
            if(cnt[t] > max){
                max = cnt[t];
            }
        }
        return S.length() - max;
    }
}