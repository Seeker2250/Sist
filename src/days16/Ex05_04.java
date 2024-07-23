package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex05_04 {
  public static void main(String[] args) {
    String todo = "    홍길동    ";
    System.out.println("["+todo+"]");
    System.out.println("["+todo.trim()+"]");
    System.out.println("["+todo.strip()+"]");
    System.out.println("["+todo.stripLeading()+"]");
    System.out.println("["+todo.stripTrailing()+"]");
    System.out.println("["+todo+"]");
//    String.join() 유용해!
    String [] names = {"이시훈", "김준석", "원충희"};
    String content = String.join("</li><li>", names);
    System.out.println("<ol><li>"+content+"</li><ol>");//front에서 쓰일거야
  }
}
