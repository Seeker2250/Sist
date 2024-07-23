package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents object로부터 Class object 얻어오기
 */
public class Ex04 {
  public static void main(String[] args) {
//    1. Object.getClass();
    Person p1 = new Person("123456-1234567", "홍길동");
    Class cls = p1.getClass();
    System.out.println(cls);

//    2. class마다 Class 변수가 있다
//    Class cls2 = Person.class;
//    System.out.println(cls2);//new Person 안하고
//    try {
//      Person p2 = (Person) cls2.newInstance();//이렇게 해도 같아
//    } catch (InstantiationException | IllegalAccessException e) {
//      e.printStackTrace();
//    }

//    3. Class.forName();
//    String fullName = "패키지명.클래스명";
    String fullName = "days16.Person";
    try {
      System.out.println(Class.forName(fullName));
    } catch (ClassNotFoundException e) {//JDBC할 때 나와(loading 시킬 때)
      e.printStackTrace();
    }

  }//main
}//clas
