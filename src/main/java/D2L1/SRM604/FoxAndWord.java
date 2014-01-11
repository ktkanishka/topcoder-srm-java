package D2L1.SRM604;

import java.util.Arrays;

public class FoxAndWord {

    public static void main(String[] args) {
        howManyPairs(args);
    }
    
    public static int howManyPairs(String[] words){
        int result = 0;
        for(int i = 0; i < words.length; i++){
            int len = words[i].length();
            for(int j = i + 1; j < words.length; j++){
                for(int k = 0; k < len; k++){
                    if(words[j].equals(words[i].substring(k, len) + words[i].substring(0, k))){
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
