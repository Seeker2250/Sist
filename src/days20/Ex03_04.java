package days20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 */
public class Ex03_04 {
  public static void main(String[] args) {
  /*
      // C:\E\Class\SS21Class\Workspace\JavaClass\javaPro
      String dir = System.getProperty("user.dir");
      System.out.println( dir );
      */

    Properties p = System.getProperties();//getProperties의 return type이 Properties class야
    Set<Object> ks = p.keySet();
    Iterator<Object> ir = ks.iterator();
    while (ir.hasNext()) {
      String key = (String) ir.next();
      String value = p.getProperty(key);
      System.out.printf("%s=%s\n", key, value);
    }

  }//main
}//class








