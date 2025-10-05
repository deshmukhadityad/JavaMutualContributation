package CoreJavaCode.JavaString;

import java.util.HashMap;
import java.util.Map;

public class Java8_StringcharcteCount {

    public static void main(String[] args)
    {
        String str = "namea";

        Map <Character, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }

        }
        System.out.println(map);

    }

}
