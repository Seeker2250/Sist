package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex03_04 {
  public static void main(String[] args) {
    Person p1 = new Person("123456-1234567", "홍길동");
    Person p2 = new Person("123456-1234567", "홍길남");
    System.out.println(p1 == p2);//주소값 달라
//    주민등록번호만 같으면 일단 같은 사람이라고 처리
    System.out.println(p1.equals(p2));//Object.equals() override 안했어 그래서 ==와 동일한 결과값
    System.out.println(p1.hashCode());//instance가 다른 놈인데 hashcode를 override해서 같아짐
    System.out.println(p2.hashCode());


  }//main
}//class
