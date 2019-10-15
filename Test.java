import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("A", "A");
    map.put("B", "B");
    map.put("C", "C");
    map.put("D", "C");

    Iterator<String> iterator = map.values().iterator();

    while (iterator.hasNext()) {

      String s = iterator.next();
      if ("C".equals(s)) map.remove(s);
      // iterator.remove();
    }
    System.out.println(map);
  }
}
