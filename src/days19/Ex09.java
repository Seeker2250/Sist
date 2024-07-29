package days19;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents Set
 * 순서도 없고 중복도 없고~
 */
public class Ex09 {
  public static void main(String[] args) {


    //Person2 p = new Person2().builder().name("김준석").age(20).id("Sera").build();//객체 생성
    Set s = new LinkedHashSet();
    s.add(new Person2("asdf", "굿ker", 25));
    s.add(new Person2("as42", "야옹", 225));
    s.add(new Person2("as12f", "냐미", 23));
//    id가 같은 Person2 객체는 중복처리를 해서 add방지
    s.add(new Person2("admin","관리자",35));
    System.out.println(s.size());
    s.add(new Person2("admin","관리자2",32));//위에서 넣은 애랑 같은 객체로 판단, 그래서 안 들어가
    System.out.println(s.size());
  }//main
}//class

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person2 {
  String id;//PK
  String name;
  int age;

  @Override
  public int hashCode() {
    return this.id.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person2){
      Person2 p = (Person2) obj;
      return p.id.equals(this.id);
    }
    return super.equals(obj);
  }
}