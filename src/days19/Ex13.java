package days19;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents 파일 읽어와서 각 문자가 몇 개 들어있는지 파악
 */
public class Ex13 {
  public static void main(String[] args) throws IOException {

    HashMap<Character, Integer> hm = new HashMap<>();//어떤 문자, 그 수
    int cnt = 0;
    for (int i = '0'; i <= 'z'; i++) {
      if (Character.isDigit(i) || Character.isAlphabetic(i)) {
        hm.put((char) i, 0);
      }//if
    }//for

    String fileName = "Ex01.java";
    String dir = "user.dir";
    String userDir = System.getProperty(dir);
//    String path = String.format("%s/src/days19/%s", userDir, fileName);
    String path = "/Users/junst/SsEducation/src/days19/Ex02.java";
    try (FileReader fileReader = new FileReader(path)) {
      int code;
      char one;
      while ((code = fileReader.read()) != -1) {
        one = (char) code;
        if (hm.containsKey(one)) {//읽어온 게 키 값이 존재 해?
          int count = hm.get(one);//value를 읽어와
          hm.put(one, count+1);
        }//if
      }//while
    } catch (Exception e) {
    }

    Set<Map.Entry<Character, Integer>> es = hm.entrySet();
    Iterator<Map.Entry<Character, Integer>> ir = es.iterator();
    while (ir.hasNext()) {
      Map.Entry<Character, Integer> entry = ir.next();
      System.out.printf("%c==%d  %s\n"
          , entry.getKey()
          , entry.getValue()
          , "#".repeat(entry.getValue()));
    }

  }//main
}//class
