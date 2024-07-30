package days22;

import java.io.*;
import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex04 {
  public static void main(String[] args) {
//    Serialization / Deserialization
//    확인해야 할 것 : 부모가 implement Serializable 한 걸 자식이 extends했다면 자식은 implement 없이 serialization 가능한 지?
//    정답 : 가능하다!
//    자식은 implements 했는데 부모는 안 했다면?
//    정답 : 부모는 직렬화 대상에서 제외된다(null)
    Child c = new Child();
    c.name = "홍길동";//parent
    c.age = 20;//child

    User u1 = new User("김준석", "1234", 25);
    User u2 = new User("이시훈", "5678", 27);

    String name = "./src/days22/child.txt";
    try(FileOutputStream fos = new FileOutputStream(name);//저장하려면 OutputStream 필요,
        ObjectOutputStream oos = new ObjectOutputStream(fos)){//한 번 더 가공하기 위한 보조 stream, ObjectOutputStream
      oos.writeObject(c);//java.io.NotSerializableException 발생, 쓰려면 User class에서 implements Serializable
      oos.flush();//쓰기 작업 실제 시행
      System.out.println("c object를 Serialization 해서 oos로 저장 완료!");
    }catch (Exception e){
      e.printStackTrace();
    }


  }//main
}//class
//class Parent implements Serializable {
//  String name;
//}
//class Child extends Parent{
//  int age;
//
//}
class Parent {
  String name;
}
class Child extends Parent implements Serializable{
  int age;
  private void writeObject(ObjectOutputStream out) throws IOException {
    out.writeUTF(name); // 개발자 직접  추가(부모 memeber 직접 추가)
    out.defaultWriteObject(); // age, 자동으로 추가(이건 하나만 있어도 돼 자식 꺼니까)
  }
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    name = in.readUTF(); // 개발자 직접  추가(부모 member 직접 추가)
    in.defaultReadObject();  // age, 자동으로 추가(이건 하나만 있어도 돼 자식 꺼니까)
  }
}