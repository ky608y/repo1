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
     System.out.println("hello world....");
    }
    System.out.println(map);
  }
}
