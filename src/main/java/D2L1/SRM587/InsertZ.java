package D2L1.SRM587;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertZ {
    public static boolean hasValidLength(String str){
        boolean b = true;
        if(str.length() >= 50 || str.length() <=0){
            b = false;
        }
        return b;
    }
    public static boolean hasLowerCase(String str){
        boolean b = true;
        char ch[] = str.toCharArray();
        for(char c : ch){
            if(Character.isUpperCase(c)){
                b = false;
            }
        }
        return b;
    }
    public static boolean checksInitChar(String init){
        boolean b = true;
        Pattern p = Pattern.compile(".*z.*");
        Matcher m = p.matcher(init);
        while(m.find()){
            b = false;
        }
        return b;
    }
    public static boolean canInsertZ(String init, String goal){
        boolean b = true;
        StringBuffer sb = new StringBuffer();
        String[] tokens = goal.split("z");
        for(String s : tokens){
            sb.append(s);
        }
        b = init.equals(sb.toString());
        return b;
    }
    public static String canTransform(String init, String goal){
        String result = "Yes";
        String no = "No";
        if(!hasValidLength(init)) result = no;
        if(!hasValidLength(goal)) result = no;
        if(!hasLowerCase(init)) result = no;
        if(!hasLowerCase(goal)) result = no;
        if(!checksInitChar(init)) result = no;
        if(!canInsertZ(init, goal)) result = no;
        return result;
    }
}