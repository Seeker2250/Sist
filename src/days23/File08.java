package days23;

import java.io.File;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/2/24.
 * @Subject
 * @Contents
 */
public class File08 {
  public static void main(String[] args) {
    File[] fileArr = {//File object를 가지고 있는 Array
        new File("Ex1.java"),
        new File("Ex1.bak"),
        new File("Ex2.java"),
        new File("Ex1"),
        new File("Ex1.txt")
    };
    Stream<File> s = Stream.of(fileArr);
//    map()
    Stream<String> s2 = s.map(File::getName);//method reference로 File의 name을 가져온 거여
//    Stream안의 element를 파일명만 가지고 있도록 변환시킨 새로운 Stream
//    모든 File의 name만 출력하고 싶다!
    s2.forEach(System.out::println);
    System.out.println();
    s = Stream.of(fileArr);
    s.map(File::getName)
        .filter(a -> a.indexOf('.') != -1)//확장자가 없는 파일명은 제외
        .map(a -> a.substring(a.indexOf('.') + 1))//확장자만 뽑아낼거야
        .distinct()//중복 있으면 제거 해!
        .forEach(System.out::println);


  }
}
