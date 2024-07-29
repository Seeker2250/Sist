package days20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 * Properties Collection 예제 만들
 */
public class Ex03_02 {
  public static void main(String[] args) {
    // 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 )
    String className = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "scott";
    String password = "tiger";

    Properties p = new Properties();
    p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
    p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
    p.setProperty("user", "scott");
    p.setProperty("password", "tiger");

    String fileName = "./src/days20/jdbcConfig.xml";//java에서 db 연결하는 설정값
//    FileReader 읽을 때
//    FileWriter 입력할 때
    try (FileOutputStream outputStream = new FileOutputStream(fileName)) {//binary data를 다뤄, writer는 문자
        p.storeToXML(outputStream, "jdbc XML test");

      System.out.println("save end");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }//main
}//class
