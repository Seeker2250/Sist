package days23;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/2/24.
 * @Subject
 * @Contents
 */
public class Ex13 {
  public static void main(String[] args) {
//    collect() : Terminal Operation
    Student[] stuArr = {
        new Student("이자바", 3, 300),
        new Student("김자바", 1, 200),
        new Student("안자바", 2, 100),
        new Student("박자바", 2, 150),
        new Student("소자바", 1, 200),
        new Student("나자바", 3, 290),
        new Student("감자바", 3, 180)
    };
//    학생들의 이름만을 뽑아와서 List<String>에 저장 후 사용

//    기존 작업
//    List<String> nameList = new ArrayList<>();
//    for (int i = 0; i < nameList.size(); i++) {
//      Student s = stuArr[i];
//      String name = s.getName();
//      nameList.add(name);
//    }

//    Stream 작업
    List asdf = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());//Collectors, Collector를 통해 어떻게 수집할 것인지를 설정 가능
    System.out.println(asdf);


//    stuArr배열 -> Stream 생성 -> Student [] 배열로 return
//    Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);//method reference, constructor를 통해 변환

//    stuArr 배열 -> Stream 생성 -> Map 변환
//    Map으로 하려면 K, V 정해야지
//    중복되는 게 있으면 안돼서 보통 학번 쓰는데 일단 여기선 이름이 중복 안되니까 이름을 K로 두자
    Map<String, Student> a = Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(), s->s));//첫 매개변수 key, 두 번째는 value
    System.out.println(a);
    System.out.println(a.keySet());
    System.out.println(a.values());
    for (String keyname: a.keySet()) {
      System.out.println(keyname);
    }
  }
}
