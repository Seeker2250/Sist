package days22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex04_02 {
  public static void main(String[] args) {
    String name = "./src/days22/child.txt";//Ex03의 경로와 같아
    try (FileInputStream fis = new FileInputStream(name);
         ObjectInputStream ois = new ObjectInputStream(fis)) {
      Child c = (Child) ois.readObject();
      System.out.println(c.name + "/" + c.age);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
