package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents cmd + n가 getter + setter 단축키
 */
public class Person {

  public Person() {
  }

  public Person(String n, int a, boolean g) {
    name = n;
    age = a;
    gender = g;
  }

  //  fields
  private String name = "익명";
  private int age = 20;
  private boolean gender = true;

  public Person(String n) {
    n = name;
  }

  public Person(String b, int a) {
    name = name;
    age = a;
  }

  public boolean isGender() {//boolean type field는 isGender가 되어버려
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //method
  public void dispPerson() {
    System.out.printf("이름 : %s, 나이 : %d\n", name, age);
  }

  //  getter method, setter method
  public void setAge(int _age) {
    if (_age < 0 || _age > 150)//유효성 검사
      throw new NullPointerException();
    else {
      age = _age;
    }
  }

  public int getAge() {
    return age;
  }

}// Person
