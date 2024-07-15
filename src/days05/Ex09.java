package days05;

public class Ex09 {
  public static void main(String[] args) {
    String todo = "Auto-generated method stub";
    //배열크기는 length야 -> field
    //String은 lengh()야 -> method
//    System.out.println(todo.length());
//    배열은 type [] name = new type[]; 이잖아
    char [] todoCharArr = new char[todo.length()];
    for (int i = 0; i < todo.length(); i++) {
      todoCharArr[i] = todo.charAt(i);
      System.out.println(todoCharArr[i]);
    }//String -> Char Array

    String target = "";
    for (int i = 0; i < todo.length(); i++) {
      target += todoCharArr[i];
    }//Char Array->String
    System.out.println(target);
  }
}
