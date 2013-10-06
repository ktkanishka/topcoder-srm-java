package D2L1.SRM593;

public class RaiseThisBarn {
    public int calc(String str){
        int result = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == 'c') a++;
        }
        if(a % 2 == 0 && a > 0){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'c'){
                    b++;
                }
                if((a / 2) <= b && b < ((a / 2) + 1) && str.charAt(i) == '.'){
                    result++;
                }
            }
            result = result + 1;
        } else if (a % 2 == 0 && a == 0){
            result = str.length() - 1;
        }
        return result;
    }
}
