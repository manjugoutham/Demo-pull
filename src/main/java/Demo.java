import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String args[]) {
        Map<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "Java");
        hash.put(2, "Hello");
        for (Map.Entry<Integer,String> entry : hash.entrySet()) {
            System.out.println(entry);
        }

        for (Integer key : hash.keySet()) {
            System.out.println(key);

        }
    }
}

