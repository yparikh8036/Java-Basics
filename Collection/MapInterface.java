import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
class xyz{
    public static void main(String[] args) {
        Map<String, String> abc = new TreeMap<>();
       // Map<String, String> abc = new HashMap<>();
        abc.put("1", "yash"); 
        abc.put("2111", "parikh"); 
        abc.put("912", "yh"); 
        abc.put("014", "ysh"); 
        abc.put("10", "yashparikh"); 
        System.out.println(abc);
    }
}