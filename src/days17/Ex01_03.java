package days17;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex01_03 {
  public static void main(String[] args) {
    String [] names = {
        "김준석",
        "최사랑",
        "박준용",
        "원충희",
        "이시훈"
    };
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
    Arrays.sort(names, Collections.reverseOrder());
    System.out.println(Arrays.toString(names));
  }
}
