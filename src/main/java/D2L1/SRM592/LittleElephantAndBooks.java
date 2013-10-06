package D2L1.SRM592;

import java.util.Arrays;

public class LittleElephantAndBooks {
    public int getNumber (int[] pages, int number){
        int result = 0;
        int sn = 0;
        Arrays.sort(pages);
        for(int i = 0; i < number-1; i++){
            result += pages[i];
            sn++;
        }
        if(sn != 0){
            result += pages[sn+1];
        } else {
            result = pages[1];
        }
        return result;
    }
}
