package days22;

import java.io.Serializable;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class User implements Serializable {

  String name;
//  object를 직렬화 할 때 password는 직렬화에서 빼고싶다면?
  transient String password;//직렬화 할 때 null 나와
  int age;
  public User(){
    this("Unknown","1234",0);
  };

  public User(String name, String password, int age) {
    this.name = name;
    this.password = password;
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", age=" + age +
        '}';
  }
}
