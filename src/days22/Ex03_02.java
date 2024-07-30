package days22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents ObjectOutputStream에 의해 u1, u2, list가 직렬화 및 저장된 상태
 * 이걸 읽어올거야
 */
public class Ex03_02 {
  public static void main(String[] args) {
    String name = "./src/days22/user.txt";//Ex03의 경로와 같아
    try (FileInputStream fis = new FileInputStream(name);
         ObjectInputStream ois = new ObjectInputStream(fis)) {
//      Deserialization, 역질렬화로 바로 불러와
      User u1 = (User) ois.readObject();
//      u1.name;
      User u2 = (User) ois.readObject();
//      u1.age;
      ArrayList<User> list = (ArrayList<User>) ois.readObject();

      System.out.println(u1);
      System.out.println(u2);
      System.out.println(list);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
