package days22;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 * Serialization(직렬화)
 *    ㄴ Object를 Stream으로 만든 것.
 *    ㄴ Data를 송수신하기 위한 것
 * Deserialization
 *    ㄴ Stream -> Object
 *
 * Java io에서 serialization / deserialization
 *      ObjectInputStream / ObjectOutputStream
 *
 * 사용자의 정보를 송수신하고 싶다
 * 이름, 주소, 나이 등 정보
 * String info = "홍길동/서울/23/등"; 하나의 통짜 문자열로 만들어 -> 구분자로 합쳤다가 나눴다가 해야하니까 불편해, 형변환도 해야해
 * class를 사용하면 원하는 정보만 가능
 * class object를 stream으로 하면? 더 간편해!
 *
 */
public class Ex03 {
  public static void main(String[] args) {
    User u1 = new User("김준석", "1234", 25);
    User u2 = new User("이시훈", "5678", 27);

    ArrayList<User> list = new ArrayList<>();
    list.add(u1);//object에 object 담기
    list.add(u2);
//    u1, u2, list object를 serialization -> 파일 쓰기 및 저장
    String name = "./src/days22/user.txt";
    try(FileOutputStream fos = new FileOutputStream(name);//저장하려면 OutputStream 필요,
        ObjectOutputStream oos = new ObjectOutputStream(fos)){//한 번 더 가공하기 위한 보조 stream, ObjectOutputStream
      oos.writeObject(u1);//java.io.NotSerializableException 발생, 쓰려면 User class에서 implements Serializable
      oos.writeObject(u2);
      oos.writeObject(list);
      oos.flush();//쓰기 작업 실제 시행
      System.out.println("Serialization 해서 oos로 저장 완료!");
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
