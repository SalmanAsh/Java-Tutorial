import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map m = new HashMap();
        String str = "Hello, I am Salman and i am 20";

        for (char x : str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old + 1);
            } else {
                m.put(x, 1);
            }
        }
        m.remove(' ');
        System.out.println(m);

    }

}
