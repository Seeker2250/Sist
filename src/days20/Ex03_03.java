package days20;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject Properties 읽어서 사용
 * @Contents Ex03.java에서 생성된 jdbcConfig.properties 파일을
 *           Properties Collection Class를 사용해서 환경 설정값을 얻어오는 예제
 *
 *           p.laad(FileReader)
 *           value = p.getProperty(key)
 *
 *           p.keySet() 모든 키를 얻어와서 value 출력

 */
public class Ex03_03 {
  public static void main(String[] args) {
    // 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 )
    String className;
    String url;
    String user;
    String password;

    Properties p = new Properties();
//    p.setProperty("className","oracle.jdbc.driver.OracleDriver");
//    p.setProperty("url","jdbc:oracle:thin:@localhost:1521:xe");
//    p.setProperty("user","scott");
//    p.setProperty("password","tiger");

    String fileName = "./src/days20/jdbcConfig.properties";//java에서 db 연결하는 설정값
//    FileReader 읽을 때
//    FileWriter 입력할 때
    try (FileReader reader = new FileReader(fileName)){
      p.load(reader);//저장할 때 writer 사용
      //key 출력
      Set<Object> keys = p.keySet();
      Iterator<Object> ir = keys.iterator();
      while (ir.hasNext()){
        String key = (String) ir.next();
        System.out.printf("key : %s / value :  %s \n",key, p.getProperty(key));//hm.get(key)으로 value 같이 가져와
      }
//    아니면 다 가져올 피룡 없이
      user = p.getProperty("user");

      System.out.println("save end");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }//main
}//class
