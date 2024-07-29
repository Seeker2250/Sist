package days19;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Ex11_02 {
  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();

    ts.add("abc");      ts.add("alien");    ts.add("bat");
    ts.add("car");      ts.add("Car");      ts.add("disc");
    ts.add("dance");    ts.add("dzzz");     ts.add("dzzzz");
    ts.add("elephant"); ts.add("elevator"); ts.add("fan");
    ts.add("flower");

    System.out.println(ts);//ASKII기반 정렬, ASC
//    String regex = "[a-c].*";
    SortedSet<String> ss = ts.subSet("a","d");//subSet에 정규식은 어때?
    System.out.println(ss);
  }
}
