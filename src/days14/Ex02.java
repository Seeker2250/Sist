package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Ex02 {
  public static void main(String[] args) {
    Document dc1 = new Document();
    Document dc2 = new Document("sample.txt");
    Document dc3 = new Document();
    Document dc4 = new Document();

    System.out.println("end");

  }//main
}//class

class Document {
  //  Static : instance가 아무리 생성되어도 하나의 공간에서 공유해서 쓸 애들을 static으로 처리하는 것
  String fileName = "NoName";//명시적 초기화
  //  초기화 방법 : 명시적, 생성자, 블록(명시적->블록->생성자 순의 우선순위)
  static int count = 1;//Document 객체 아무리 만들어도 하나만 잡힌다.


  public Document(String fileName) {
    this.fileName = fileName;
    System.out.printf("%s 만들어졌어요\n", this.fileName);
  }

  public Document() {
//      this(this.fileName);//같은 기능하니까 호출하려고 하지만 아직 생성 안된 걸 부르려고 하면 안되지!
    this("NoName"+count++);//이미 생성된 static이니까 count 가능, 객체가 만들어질 때마다 올라가겠지
  }
}