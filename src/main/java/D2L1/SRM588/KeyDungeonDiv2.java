package D2L1.SRM588;

public class KeyDungeonDiv2 {
    
    public static boolean hasValidArrayLength(int[] arr){
        boolean b = false;
        if(arr.length <= 50 && arr.length >= 1) b = true;
        return b;
    }
    
    public static boolean hasSameElementsLength(int[] arr1, int[] arr2){
        boolean b = false;
        if(arr1.length == arr2.length) b = true;
        return b;
    }
    
    public static boolean checksDoorElements(int[] door){
        boolean b = false;
        for(int d : door){
            if(d <= 100 && d >= 1) b = true;
        }
        return b;
    }
    
    public static boolean checksKeysElementLength(int[] keys){
        boolean b = false;
        if(keys.length <= 3) b = true;
        return b;
    }
    
    public static boolean checksKeysEachElement(int[] keys){
        boolean b = false;
        for(int int1 : keys){
            if(int1 <= 100 && int1 >= 0) b = true;
        }
        return b;
    }
    
    public static int countsOpenDoors(int[] doorR, int[] doorG, int[] keys){
        int cnt = 0;
        for(int i = 0; i < doorR.length; i++){
            if(doorR[i] <= (keys[0] + keys[2])){
                if(doorG[i] <= (keys[1] + keys[2])){
                    if(doorR[i] + doorG[i] <= keys[0] + keys[1] + keys[2]){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    
    public int countDoors(int[] doorR, int[] doorG, int[] keys){
        boolean b = true;
        int result = 0;
        if(!hasValidArrayLength(doorR)) b = false;
        if(!hasValidArrayLength(doorG)) b = false;
        if(!hasSameElementsLength(doorG, doorR)) b = false;
        if(!checksDoorElements(doorR)) b = false;
        if(!checksDoorElements(doorG)) b = false;
        if(!checksKeysElementLength(keys)) b = false;
        if(!checksKeysEachElement(keys)) b = false;
        if(b){
            result = countsOpenDoors(doorR, doorG, keys);
        }
        return result;
    }
}