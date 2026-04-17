// Hash map interface
import java.util.*;
public class Collection4{
    public static void main(String[] args) {
        Map<Integer,String> m= new HashMap<>();
        m.put(2, "ram");
        m.put(1, "sita");
        m.put(4, "tia");
        m.put(3, "rohit");
        System.out.println(m);
        m.put(null, "shyam");
        //m.put(5, null);
        //m.put(4, null);
        m.put(null, null);
        System.out.println(m);
        m.remove(1);
        //searching
        //System.out.println(m);
        System.out.println(m.containsKey(7));
       // System.out.println(m.containsValue(null));
       System.out.println(m.containsValue("sita"));
       // contains is used for seaching
       // for showing key
       System.out.println(m.keySet());
       // for showing values
       System.out.println(m.values());
    }   
}